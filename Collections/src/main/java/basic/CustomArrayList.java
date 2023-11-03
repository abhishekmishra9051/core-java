package basic;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList  extends ArrayList {

    @Override
    public boolean add(Object o) {
       if(this.contains(o)) return true;
       else  return super.add(o);
    }

    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(1);
        System.out.println(list1);

        List<String> list = new ArrayList<>(list1);
        list.add("3");
        list.add("5");
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add("6");
        System.out.println(list2);
        ArrayList<String> arrayList = new ArrayList<>(list2);
        System.out.println(arrayList);

    }
}
