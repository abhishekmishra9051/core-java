package interfaces;

import java.io.*;

public class B  implements Serializable  {

    int i;
    String s;

    public B(int i, String s){
        this.i = i;
        this.s = s;
    }

    public static void main(String[] args)
            throws CloneNotSupportedException, IOException, ClassNotFoundException {

        B a = new B(2, "Abhishek");

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
         B c = (B) ois.readObject();

        System.out.println(c.i +" " + c.s);

    }
}
