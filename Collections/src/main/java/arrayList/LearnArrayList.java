package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args){
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);

        System.out.println(alist);

//        Iterator<Integer> iterator = alist.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

//        for(int x : alist)
//            System.out.println(x);

        System.out.println("Element that got replaced : " + alist.set(0, 100));

        List<Integer> alist1 = new ArrayList<>(alist);
        alist1.add(6);
        alist1.add(7);
        alist1.add(8);
        alist1.addAll(alist);
        System.out.println(alist1);

    }
}
