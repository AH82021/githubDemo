package mapDemo;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // List ,Set, Iterable,Collection
        // Map  key , value
        // 1 Jack 2 Ryan 3 Adam
        // Java  4
        // Map  -> HashMap , TreeMap ,EnumMap, LinkedHashMap , WeakHashMap

        // gogle.com -> 202.102.199

        Map<String,Integer> map = new HashMap<String,Integer>();
        //add
        // Set of keys
        // values
        // entry set
        map.put("apple",1);
        map.put("banana",2);
        map.put("cherry",10);
        map.put("date",4);
        //update
        map.put("date",10);
        System.out.println(map);
     boolean isAvail =  map.containsKey("bread");
   boolean isValue =   map.containsValue(10);
        System.out.println(isValue);
        System.out.println(isAvail);
//        int value = map.get("bread");
//        System.out.println(value);

        //Values
        Collection<Integer> values = map.values();

        //Key
         Set<String> keys =   map.keySet();


         //entry set

    Set<Map.Entry<String,Integer>> entrySet   = map.entrySet();
        System.out.println(entrySet);
        System.out.println(keys);
        System.out.println(values);




Map<String, String> names = new HashMap<String, String>();

    }
}
