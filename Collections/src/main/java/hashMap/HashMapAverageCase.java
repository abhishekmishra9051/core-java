package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAverageCase {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Abhishek");// o(1)
        map.put(2, "Mishra");

//        String count = map.get(1);
//        System.out.println(count);

//        Using entrySet() The time complicity is 0(n);
/*
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key  +" : "+ value);
        }
*/

//        Using  keySet(), tc -> O(n);
        for(Integer key : map.keySet()){
            String value = map.get(key);
            System.out.println(key +" : "+value);
        }
    }
}
