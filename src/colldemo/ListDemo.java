package colldemo;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        //ordered but not sorted
        //duplicacy allowed
        list.add("sunday");
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("tuesday");
        System.out.println(list.size());
        System.out.println(list);
    }
    
}
