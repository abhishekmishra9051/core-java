package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class OneExample {
    //1. Creating HashMap with default initial capacity and load factor
    HashMap<String, Integer> map1 = new HashMap<String, Integer>();

    //2. Creating HashMap with 30 as initial capacity
    HashMap<String, Integer> map2 = new HashMap<>(30);

    //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
    HashMap<String, Integer> map3 = new HashMap<>(30, 0.75f);

    //4. Creating HashMap by copying another HashMap
    HashMap<String, Integer> map4 = new HashMap<>(map1);
}
