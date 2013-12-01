package poepassiveskilltreeoptimizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasePerk {
    
    public int id;
    public String name;
    private Pattern pattern;

    public BasePerk( int id, String name, String regex ) {
        this.id = id;
        this.name = name;
        this.pattern = Pattern.compile( regex );
    }
    
    public Integer getValue( String s ){
        Matcher matcher = pattern.matcher( s );
        if( !matcher.matches() )
            return null;
        else {
            if( matcher.groupCount() == 0 )
                return 1;
            else
                try {
                    return Integer.parseInt( matcher.group(1) );
                } catch( Exception e ){
                    return (int) Float.parseFloat( matcher.group(1) );
                }
        }
    }
}
