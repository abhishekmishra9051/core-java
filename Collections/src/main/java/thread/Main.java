package thread;

import java.io.PrintStream;

class MyThread extends Thread {

    private String name;
    public MyThread(String name){
        this.name = String.valueOf(name);
    }
    @Override
    public void run() {
        System.out.println("Hello From the new thread! " + name);
    }
}

class MyRunnable implements Runnable{

    private int id;

    public MyRunnable(){}
    public MyRunnable(int id){
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Runnable...!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread("Thread - 01");
        MyThread thread1 = new MyThread("New");
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();

        Thread thread2 = new Thread(new MyRunnable(001));
        thread2.start();
        thread2.getId();
        thread.start();
        thread1.start();
        String name = thread.getName();
        System.out.println(name);

        try{
            thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread End!");
    }
}
