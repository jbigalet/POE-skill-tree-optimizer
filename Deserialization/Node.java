package poepassiveskilltreeoptimizer.Deserialization;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Node {
    public int id;
    public String icon;
    public boolean ks;
    public boolean not;
    public String dn;
    public boolean m;
    public int[] spc;
    public String[] sd;
    public int g;
    public int o;
    public int oidx;
    public int sa;
    public int da;
    public int ia;
    public List<Integer> out;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
