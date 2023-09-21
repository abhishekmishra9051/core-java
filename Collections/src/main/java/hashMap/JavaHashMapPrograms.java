package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class JavaHashMapPrograms {

    // Method to add key-value pairs to the map and print them
    public static void addAndPrintKeyValuePairs() {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs to the map using put() method
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);

        // Printing key-value pairs
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------");

        // Creating another HashMap
        HashMap<String, Integer> anotherMap = new HashMap<>();

        // Inserting key-value pairs to anotherMap using put() method
        anotherMap.put("SIX", 6);
        anotherMap.put("SEVEN", 7);

        // Inserting key-value pairs of map to anotherMap using putAll() method
        anotherMap.putAll(map);

        // Printing key-value pairs of anotherMap
        entrySet = anotherMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        addAndPrintKeyValuePairs();
    }
}
