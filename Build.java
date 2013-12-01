package poepassiveskilltreeoptimizer;

import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.DatatypeConverter;

public class Build {

    public int level;
    public String POEClass;
    public Set<Integer> nodes;
    
    public int[] perkValues;
    public BuildPerks perkProp;
    
    public ItemBuild itemBuild;
    
    public String toWrite;
    
    public Build( String POEClass, int level, Set<Integer> nodes ) {
        this.POEClass = POEClass;
        this.nodes = nodes;
        this.level = level;
        
        execPerks();
    }
    
    public Build( int level, String url ){
        Set<Integer> s = new HashSet<>();

        String token = url.replace('-', '+').replace('_', '/');
        byte[] buff = DatatypeConverter.parseBase64Binary(token);
        for( int i=6 ; i < buff.length ; i+=2 )
            s.add( ( buff[i] & 0xFF ) << 8 | buff[i+1] & 0xFF );
        
        this.nodes = s;
        this.POEClass = Main.poeClasses[buff[4]];
        this.level = level;
        
        execPerks();
    }
    
    public void setItemBuild(ItemBuild itemBuild){
        this.itemBuild = itemBuild;
        
    }
    
    private void execPerks(){
        perkValues = new int[BasePerks.perkCount];
        for(Integer iNode : nodes)
            Main.baseSkillTree.nodePerks[iNode].exec( perkValues );
        
        perkProp = new BuildPerks( perkValues );
    }
    
    public String getUrl(){
        byte[] bytes = new byte[ 6 + 2 * nodes.size() ];
        bytes[0] = 0;
        bytes[1] = 0;
        bytes[2] = 0;
        bytes[3] = 2;
        while( !POEClass.equals(Main.poeClasses[bytes[4]]) ) bytes[4]++;
        bytes[5] = 1; // isFullScreen
        
        int pos = 6;
        for( int iNode : nodes ){
            bytes[pos++] = (byte) (iNode >> 8);
            bytes[pos++] = (byte) iNode;
        }
        
        return "http://www.pathofexile.com/passive-skill-tree/"
                + DatatypeConverter.printBase64Binary( bytes ).replace('/', '_').replace('+', '-');
    }
    
    
    public double calculateShit(){
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
        
//        double mainHandCC = 9.2;
//        double mainHandAS = 1.2;
//        
//        double offHandCC = mainHandCC;
//        double offHandAS = mainHandAS;
////
////        double offHandCC = 5;
////        double offHandAS = 1.88;
//        
//        int itemsLife = 99 + 65 + 72 + 70 + 70 + 109
//                /*Sash-Boots-Amu-(LRing-RRing ?)-Chest*/;
//        int itemsMana = 0 /*XmainHand*/;
//        int itemsER = 720 + 124 + 223 /*Hat-Gloves */;
//        int itemsArmour = 76 + 223 /*Boots-Chest*/;
//        int itemsAR = 263 + 250 + 250 /*Amu-(LRing-RRing)?*/;
//        int itemsPercER = 4 + 97 /*Amu-JadeFlask*/;
//        int itemsPercArmour = 93 /*GraniteFlask*/;
//
//        int itemsInt = 0 /**/;
//        int itemsStr = 13 + 20 /*Boots-Amu*/;
//        int itemsDex = 25 /*Gloves*/;
//        
//        int itemsSpellDmg = 47 + 58 + 20 /*mainHand-offHand-Amu*/;
//        int itemsIncPhDmg = 24 /*Sash*/;
//        int itemsGlobalCritMult = 61 + 42 /*Amu-gloves*/;
//        int itemsGlobalCritChance = 80 + 80 + 50 + 70 /*mainHand-offHand-gloves-hat*/;
//        int itemsAS = 5 + 15 /*gloves-hat*/;
//        
//        
//        
//        int hatredAuraIncDmg = 36;     // lvl 20
//        int graceAuraER = 2016;        // lvl 20
//        
//        double averageEKGemDmg = 543.5;      // lvl 20: 435–652	
//        double EKQualityProjDmg = 15;       // q20
//        int cycloneASInc = 38;       // lvl 20
//        int CoCProcChance = 68;       // lvl 20
//        int CoCBonusCritChance = 20;    // q20
//        int CWCritChance = 9;           // lvl 20
//        int CWCritDmgAmplifier = 79;       // 20/20
        
        
        
//        double mainHandCC = 9.02;
//        double mainHandCC = 9.5;
        double mainHandCC = 8.5;
        double offHandCC = 8.5;
//        double mainHandAS = 1.2;
        double mainHandAS = 1.79;
        double offHandAS = 1.67;
//        
//        double offHandCC = mainHandCC;
//        double offHandAS = mainHandAS;        
//        
//        int itemsLife = 68 + 99 + 65 + 72 + 67 + 78 
//                /*Gloves-Sash-Boots-Amu-LRing-RRing*/;
//        int itemsMana = 10 /*mainHand*/;
//        int itemsER = 62 + 210 /*Hat-Gloves */;
//        int itemsArmour = 210 + 76 /*Gloves-Boots */;
//        int itemsAR = 305 + 263 + 245 + 248 /*Gloves-Amu-LRing-RRing*/;
//        int itemsPercER = 4 + 97 /*Amu-JadeFlask*/;
//        int itemsPercArmour = 93 /*GraniteFlask*/;
//
//        int itemsInt = 35 + 7 /*offHand-LRing*/;
//        int itemsStr = 13 + 20 + 7 /*Boots-Amu-LRing*/;
//        int itemsDex = 7 /*LRing*/;
//        
//        int itemsSpellDmg = 47 + 58 + 20 /*mainHand-offHand-Amu*/;
////        int itemsIncPhDmg = 22 /*Sash*/;
//        int itemsIncPhDmg = 24 /*Sash*/;
//        int itemsGlobalCritMult = 61 + 42 /*Amu-gloves*/;
////        int itemsGlobalCritChance = 60 + 60 /*mainHand-offHand*/;
//        int itemsGlobalCritChance = 80 + 80 + 50 + 70 /*mainHand-offHand-gloves-hat*/;
//        int itemsAS = 5 + 15 /*gloves-hat*/;
        
        int itemsLife = 99 + 65 + 72 + 71 + 76// + 109
                /*Sash-Boots-Amu-LRing-RRing*/;
        int itemsMana = 24 + 38 /*MainHand-RRing*/;
        int itemsER = 720 + 124 /*Hat-Gloves */;
        int itemsArmour = 76 /*Boots*/;
        int itemsAR = 263 + 290 /*Amu-LRing*/;
        int itemsPercER = 4 + 97 /*Amu-JadeFlask*/;
        int itemsPercArmour = 93 /*GraniteFlask*/;

        int itemsInt = 0 /**/;
        int itemsStr = 13 + 20 /*Boots-Amu*/;
        int itemsDex = 25 /*Gloves*/;
        
        int itemsSpellDmg = 52 + 46 + 20 /*mainHand-offHand-Amu*/;
        int itemsIncPhDmg = 22 /*Sash*/;
        int itemsGlobalCritMult = 61 + 48 + 34 /*Amu-gloves*/;
        int itemsGlobalCritChance = 40 + 40 + 50 + 70 /*mainHand-offHand-gloves-hat*/;
        int itemSpellCritChance = 0;
        int itemsAS = 5 + 15 /*gloves-hat*/;
//        int itemsGlobalCritMult = 61 + 0 /*Amu-gloves*/;
//        int itemsGlobalCritChance = 60 + 60 + 0 /*mainHand-offHand-gloves-hat*/;
//        int itemsAS = 0 /*gloves-hat*/;

        
        int hatredAuraIncDmg = 35;     // lvl 19
//        int hatredAuraIncDmg = 36;     // lvl 20
        int graceAuraER = 1940;        // lvl 19
//        int graceAuraER = 2016;        // lvl 20
        
//        double averageEKGemDmg = 492.5;      // lvl 19: 394-591
        double averageEKGemDmg = 543.5;      // lvl 20: 435–652	
        double EKQualityProjDmg = 0;       // q0
//        double EKQualityProjDmg = 15;       // q0
        int cycloneASInc = 32;       // lvl 17
//        int cycloneASInc = 38;       // lvl 20
//        int CoCProcChance = 66;       // lvl 19
        int CoCProcChance = 68;       // lvl 20
        int CoCBonusCritChance = 5;    // q5
//        int CoCBonusCritChance = 20;    // q20
//        int CWCritDmgAmplifier = 79;       // 20/20
        
        int CWCritDmgAmplifier = 48;       // lvl 19 q0
        int CWCritChance = 9;              // lvl 20
//        int CWCritDmgAmplifier = 0;       // lvl 19 q0
//        int CWCritChance = 0;              // lvl 20
        
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
// ----------------------------------------------------------------------
        
        double auraBuffs = (100 + perkProp.percEffectOfAuras + perkProp.percFlatEffectOfBuffsOnYou) / 100d;
        double hatredRealDmgInc = (int)( hatredAuraIncDmg * auraBuffs * 
                1//( 100 + perkProp.percColdDmg + perkProp.percEleDmg + perkProp.percEleDmgWithSpells ) / 100d
                ) / 100d;   // Why the fuck is this rounded down by the game.........
        
        double averageWeapCC = ( mainHandCC + offHandCC  ) / 2;
        double averageWeapAS = ( mainHandAS + offHandAS  ) / 2;
        
        int strength = 14 + itemsStr + perkProp.flatStrength;
        int dex = 32 + itemsDex + perkProp.flatDex;
        int intel = 14 + itemsInt + perkProp.flatIntel;
        
        int life = (int)((42 + 8*level + itemsLife + perkProp.flatMaxLife + strength/2d + 40 /*Oak*/) * (1+perkProp.percMaxLife/100d));
        int mana = (int)((36 + 4*level + itemsMana + perkProp.flatMaxMana + intel/2d) * (1+perkProp.percMaxMana/100d));
        
            // Iron reflexes
        int percArmour = itemsPercArmour + perkProp.percArmour + perkProp.percERAndArmour;
        int tmpArmour = (itemsArmour + 3000) * ( 100 + percArmour );
        int evasion = (int)( itemsER + 3000 + 50 + 3*level + graceAuraER*auraBuffs ) * ( 100 + itemsPercER + perkProp.percER + percArmour );
        int armour = (tmpArmour + evasion) / 100;
        
        int maxPowerCharges = 4 + perkProp.flatMaxPowerCharge;
//        int maxPowerCharges = 0;

        int accuracy = (int)(2*level + itemsAR + perkProp.flatMaxAR + dex*2) 
                * ( 100 + perkProp.percAR 
                    + perkProp.percARWithDaggers +  perkProp.percARWhileDualWielding + perkProp.percARWith1HMeleeWeapons
                ) / 100;
        double chanceToHit = 0.01d * ( 102d - Math.exp( -Math.log(accuracy/75300d) / 1.39d ));
        double attackCritChance = averageWeapCC 
                * ( 100 + 50*maxPowerCharges + itemsGlobalCritChance + CoCBonusCritChance /*CoC q20*/ 
                    + perkProp.percCritChance + perkProp.percCritChanceWithDaggers 
                    + perkProp.percCritChanceWith1HMeleeWeapons + perkProp.percWeaponCritChanceWhileDualWielding
                ) / 10000d + CWCritChance / 100d /*CW*/;
        attackCritChance = Math.min(attackCritChance, 0.95d);
        double attackSpeed = averageWeapAS 
                * ( 100 + perkProp.percAS + perkProp.percASWhileDualWielding
                    + perkProp.percASWith1HMeleeWeapons + perkProp.percASWithDaggers
                    + cycloneASInc + itemsAS
                ) * 1.1 /*Dual wield bonus*/ / 100d;
        
        double chanceToProcEKPerWeapon = (CoCProcChance/100d) * attackCritChance * chanceToHit;
        double averageEKPerSec = chanceToProcEKPerWeapon * attackSpeed * 2 /*there is 2 EK*/ * 2 /*2 attacks per cyclone*/;
        
        double EKCritChance = 5 
                * ( 100 + 50*maxPowerCharges + itemsGlobalCritChance + CoCBonusCritChance /*CoC q20*/ 
                    + perkProp.percCritChance + perkProp.percCritChanceForSpells + itemSpellCritChance
                ) / 10000d + CWCritChance / 100d /*CW*/;
        EKCritChance = Math.min(EKCritChance, 0.95d);
        double EKCritDmg = 1.5d*
                ( 100 + (100+CWCritDmgAmplifier)/100d
                /*CW*/ *( perkProp.percCritMultiplier + perkProp.percCritMultiplierForSpells + itemsGlobalCritMult) 
                )/100d;
        
        double baseEKDmg = averageEKGemDmg * (
                hatredRealDmgInc * (
                    100 
                    + itemsSpellDmg + itemsIncPhDmg 
                    + perkProp.percProjDmg + EKQualityProjDmg + perkProp.percSpellDmg
                    + perkProp.percSpellDmgPerPowerCharge * maxPowerCharges 
                    + 18
                    + perkProp.percColdDmg + perkProp.percEleDmg + perkProp.percEleDmgWithSpells
                ) + ( 100 
                    + itemsSpellDmg + itemsIncPhDmg 
                    + perkProp.percProjDmg + EKQualityProjDmg + perkProp.percSpellDmg
                    + perkProp.percSpellDmgPerPowerCharge * maxPowerCharges 
                    + 18 // Oak 
                )) / 100d ;
        
        double averageEKDmg = baseEKDmg * ( 1-EKCritChance + EKCritChance*EKCritDmg);
        double totalAverageEKDmg = averageEKDmg * averageEKPerSec;
        
            // HP > 4000 ; Armour > 20k ; Iron Reflexes
//        double score = totalAverageEKDmg;
//        if( life < 4000 )                   score /= 100d;
//        if( armour < 20000 )                score /= 100d;
//        if( perkProp.ironReflexes != 1 )    score /= 100d;
//        return score;
        
//        double score = Math.pow(life, 1.5) * totalAverageEKDmg;
//        toWrite = "Life: " + life + " || DPS: " + totalAverageEKDmg + " (" + score + ")";
//        if( perkProp.ironReflexes != 1 ) System.out.println("YO WADAFUQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
//        return score;
        
        System.out.println();
        System.out.println("--- Recap [" + nodes.size() + "] ---");
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dex);
        System.out.println("Intelligence: " + intel);
        System.out.println("HP: " + life);
        System.out.println("Mana: " + mana);
        System.out.println("Armour: " + armour);
        System.out.println("Max power charges: " + maxPowerCharges);
        System.out.println();
        System.out.println("----- Cyclone -----");
        System.out.println("Accuracy: " + accuracy);
        System.out.println("Chance to hit: " + (100d*chanceToHit));
        System.out.println("Crit chance: " + (100d*attackCritChance));
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println();
        System.out.println("------- EKs -------");
        System.out.println("Chance to proc (per weapon hit): " + (100d*chanceToProcEKPerWeapon));
        System.out.println("Average EK per seconds: " + averageEKPerSec);
        System.out.println("Base EK damage: " + baseEKDmg);
        System.out.println("Crit chance: " + (100d*EKCritChance));
        System.out.println("Crit multiplier: " + (100d*EKCritDmg));
        System.out.println("Average EK damage: " + averageEKDmg);
        System.out.println("Total average damage: " + totalAverageEKDmg);
        System.out.println("Total average damage (with 3 EK & multistrike): " + (totalAverageEKDmg*2.07*3d/2d));
        
        return 0;
    }
    
    
    @Override
    public String toString(){
//        System.out.println(Arrays.toString(perkValues));
        StringBuilder sb = new StringBuilder("\n");
        sb.append("#####################\n");
        sb.append("#### ").append(POEClass).append(" Build ####\n");
        sb.append("#####################\n\n");
        
        sb.append(getUrl()).append("\n\n");
        
        sb.append("||||||||||||||||||||\n");
        sb.append("|||| Skill Tree ||||\n");
        sb.append("||||||||||||||||||||\n\n");
        
        for(int i=0 ; i<perkValues.length ; i++)
            if( perkValues[i] != 0 )
                sb.append("% ").append(BasePerks.perkList[i].name).append(" = ").append(perkValues[i]).append("\n");
        
        sb.append("\n|||||||||||||||\n");
        sb.append("|||| Stats ||||\n");
        sb.append("|||||||||||||||\n\n");
        
        return sb.toString();
    }
}
