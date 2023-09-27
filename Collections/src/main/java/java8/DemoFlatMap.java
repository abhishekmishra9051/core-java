package java8;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.stream.Collectors;

public class DemoFlatMap {
    public static void main(String[] args) {

        // making the arraylist object of List of Integer
        List<List<Integer>> number = new ArrayList<>();
        number.add(Arrays.asList(1,2));
        number.add(Arrays.asList(3,4));
        number.add(Arrays.asList(5,6));
        number.add(Arrays.asList(7,8));
        number.add(Arrays.asList(9,10));
        System.out.println("List of list-" + number);

        List<Integer> flatList = number.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("List generate by flatMap-"
                + flatList);

    }
}
