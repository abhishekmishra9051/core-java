package hashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1 writes a value to the key "Zig".
        new Thread(() -> {
            map.put("Zig", 10);
            System.out.println("Thread 1 wrote 10 to key \"Zig\"");
        }).start();

        // Thread 2 writes a value to the key "Zag".
        new Thread(() -> {
            map.put("Zag", 20);
            System.out.println("Thread 2 wrote 20 to key \"Zag\"");
        }).start();

        // Wait for both threads to finish.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Read the values from the map.
        System.out.println("Value for key \"Zig\": " + map.get("Zig"));
        System.out.println("Value for key \"Zag\": " + map.get("Zag"));
    }
}

