package colldemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
     public static void main(String[] args) {
        //HashSet<String> set=new HashSet<>();//unordered & unsorted
        //LinkedHashSet<String> set=new LinkedHashSet<>();//ordered
        TreeSet<String> set=new TreeSet<>();//unordered but sorted
        set.add("sunday");
        set.add("monday");
        set.add("tuesday");
        set.add("wednesday");
        set.add("thursday");
        set.add("friday");
        set.add("saturday");
        set.add("tuesday");
        System.out.println(set.size());
        System.out.println(set);
    }
}
