package colldemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //HashMap<String,String> map=new HashMap<>();
        //LinkedHashMap<String,String> map=new LinkedHashMap<>();
        TreeMap<String,String> map=new TreeMap<>();
        map.put("e5100", "Amit");
        map.put("e2340", "Raj");
        map.put("e4350", "Priya");
        map.put("e3355", "Riya");
        map.put("e5567", "Riya");
        System.out.println(map);
    }
    
}
