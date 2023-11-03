package hashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(1, "Abhishek");

        String value = concurrentHashMap.get(1);
        System.out.println(value);
    }
}
