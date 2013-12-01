package poepassiveskilltreeoptimizer.Genetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Genetic {
    
    public static int popSize = 200;                    // 1000 builds
    public static int stableGenerationToRestart = 2000;
    public static int localGeneration = 300;
    public static double crossoverProba = 0.85;          // 80% chance when selecting 2 parents to generate 2 childs.
                                                        // If not (20%), keep the parents.
    public static double mutationProba = 0.1;           // 10% mutate (100)
    public static double mutationMaxPropSize = 0.1;     // They're mutating between 1 and 20% of nPoints : 1-10 [50]
    public static double elitismProp = 0.04;           // 3% elitism, i.e. we keep the best 3%
    public static double newRandomGuysProp = 0.1;           // 10% new random guys, i.e. we randomly create 10 builds

//    public static int popSize = 100;                    // 1000 builds
//    public static int stableGenerationToRestart = 200;
//    public static int localGeneration = 100;
//    public static double crossoverProba = 0.95;          // 80% chance when selecting 2 parents to generate 2 childs.
//                                                        // If not (20%), keep the parents.
//    public static double mutationProba = 0.05;           // 10% mutate (100)
//    public static double mutationMaxPropSize = 0.1;     // They're mutating between 1 and 20% of nPoints : 1-10 [50]
//    public static double elitismProp = 0.04;           // 3% elitism, i.e. we keep the best 3%
//    public static double newRandomGuysProp = 0.05;           // 10% new random guys, i.e. we randomly create 10 builds

    private static Random rand = new Random();
    
    public static void optimalBuild(String poeClass, int level, int nPoints) {
        
        int mutationMax = (int) (mutationMaxPropSize * nPoints);
        
        int elitism = (int) (elitismProp * popSize);
        int newRandGuys = (int) (newRandomGuysProp * popSize);
        int crossovers = (popSize - elitism - newRandGuys) / 2;
        
        Chromosome[] pop = new Chromosome[popSize];
        for( int i=0 ; i<popSize ; i++ )
            pop[i] = new Chromosome(poeClass, level, nPoints);
        
        double globalmax = 0;
        double max = 0;
        int genMax = 0;
        String toPrint = "";
//        int nGen = 0;
//        while( nGen++ < 1000 ){
        while( true ){
            Arrays.sort( pop );
            
            if( max < pop[popSize-1].score ){
                max = pop[popSize-1].score;
                if( globalmax < max ){
                    globalmax = max;
                    toPrint = pop[popSize-1].build.toWrite + " [" + genMax + "] -> " + pop[popSize-1].build.getUrl();
                    System.out.println(toPrint);
//                    if( globalmax > 250 )
//                        System.exit(0);
                }
                genMax = 0;
                pop[popSize-1] = pop[popSize-1].localOptimization( mutationMax, localGeneration );
            } else if( genMax > stableGenerationToRestart ){
//                System.out.println("Restart: " + toPrint);
                genMax = 0;
                max = 0;
                for( int i=0 ; i<popSize ; i++ )
                    pop[i] = new Chromosome(poeClass, level, nPoints);
                continue;
            }
            genMax++;
            
            List<Chromosome> newPop = new ArrayList<>( popSize );
            for( int i =0 ; i < elitism ; i++ )
                newPop.add( pop[popSize-i-1] );
            
            int totalScore = 0;
            for( Chromosome c : pop )
                totalScore += c.score;
            
            for( int i=0 ; i < crossovers ; i++ ){
                Chromosome c1 = selectionOne(pop, totalScore);
                Chromosome c2 = selectionOne(pop, totalScore);
                if( rand.nextDouble() > crossoverProba ){
                    newPop.add(c1);
                    newPop.add(c2);
                } else {
                    Chromosome d1 = new Chromosome(c1, c2);
                    Chromosome d2 = new Chromosome(c1, c2);
                    if( rand.nextDouble() < mutationProba )
                        d1.mutation( rand.nextInt( mutationMax ) );
                    if( rand.nextDouble() < mutationProba )
                        d2.mutation( rand.nextInt( mutationMax ) );
                    newPop.add(d1);
                    newPop.add(d2);
                }
            }
                
            while( newPop.size() != popSize )
                newPop.add( new Chromosome(poeClass, level, nPoints) );
            
             newPop.toArray( pop );
        }
    }

    private static Chromosome selectionOne( Chromosome[] pop, int totalScore ){
        int r = 1 + rand.nextInt(totalScore);
        int a = 0;
        for( Chromosome c : pop ){
            a += c.score;
            if( a >= r )
                return c;
        }
        return null;
    }
}
