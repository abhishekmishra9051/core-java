package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class StreamOperations {
    public static void numberStartingWithOne(List<Integer> myList) {
        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }

//    Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void evenNumber(List<Integer> myList){
        myList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
    }

    public static void duplicateElements(List<Integer> myList){
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }

    public static void findFirstElement(List<Integer> myList){
        myList.stream().findFirst().ifPresent(System.out::println);
    }

    public static void findTheTotalNumberOfElements(List<Integer> myList){
        long count = myList.stream().count();
        System.out.println(count);
    }

    public static void findMaxElement(List<Integer> myList){
        int max = myList.stream().max(Integer::compare).get();
        System.out.println(max);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 15, 43, 56, 54, 32, 53, 64, 49, 15, 43);
        //list.stream().filter(n -> n%2 == 0).sorted().forEach(System.out::println);
        evenNumber(list);
        System.out.println("______");
        numberStartingWithOne(list);
        System.out.println("______");
        duplicateElements(list);
        System.out.println("______");
        findFirstElement(list);
        System.out.println("______");
        findTheTotalNumberOfElements(list);
        System.out.println("______");
        findMaxElement(list);
    }
}
