package hashMap;

import java.util.HashMap;

public class HashMapWorstCase {
    public static void main(String[] args) {
        HashMap<Integer ,String> hashMap = new HashMap<>(16, 0.75f);

        for(int i=0; i<1000; i++){
            hashMap.put(i," Values " + i);
        }
//        String value = hashMap.get(123);
//        System.out.println(value);

        for(Integer key: hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println(value);
//            System.out.println("HashCode -> "+value.hashCode());
//            System.out.println("Equals -> "+ value.equals(key));

        }
    }
}
