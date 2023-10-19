package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTenPracticeQuestions {
    public static void main(String[] args) {

//      1. Find the sum of all elements in a List using streams.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1, 4);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

//      2. Given a List of integers, write a program to find the maximum element using streams.
        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

//      3. Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
        List<String> newList = Arrays.asList("Apple", "Banana", "Cherry", "Coconut");
        long count = newList.stream().filter(newLists -> newLists.startsWith("C")).count();
        System.out.println(count);

//      4. Convert a List of strings to uppercase using streams.
        newList.stream().map(String::toUpperCase).forEach(System.out::println);

//      5. Given a List of integers, write a program to filter out the even numbers using streams.
//       Count the number of elements in a list that satisfy a specific condition using streams.
        long even =list.stream().filter( n -> n % 2 == 0).count();
        System.out.println(even);

//      6. Write a program to find the average of a List of floating-point numbers using streams.
        List<Double> floatNumber = Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1,8.1,9.2, 10.9);
        double avg =  floatNumber.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avg);


//      7. Given a List of strings, write a program to concatenate all the strings using streams.
        String concatenate =  newList.stream().collect(Collectors.joining("::"));
        System.out.println(concatenate);

//      8. Write a program to remove duplicate elements from a List using streams.
        list.stream().distinct().forEach(System.out::println);

//      9. Given a List of objects, write a program to sort the objects based on a specific attribute using streams.

        List<Person> person = Arrays.asList(
                new Person("Abhishek", 29),
                new Person("Ayush", 23),
                new Person("Ram", 24)
        );
        person.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//      10. Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> num = Arrays.asList(2,4,6,8,10);
        boolean allEven = num.stream().allMatch(n -> n%2 == 0);
        System.out.println("All number are: " + allEven);



//--------------------------Extra practice questions-----------------------------------

//      11. Given a List of integers, write a program to find the difference between the maximum and minimum elements using streams.
        List<Integer> numbers = Arrays.asList(4, 7, 1, 9, 3, 6, 5, 8, 2);

        int max1 = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);

        int difference = max1 - min;
        System.out.println("Maximum: " + max1);
        System.out.println("Minimum: " + min);
        System.out.println("Difference: " + difference);

//      12. Write a program to check if a List of strings contains at least one uppercase word using streams.
        List<String> words = Arrays.asList("apple", "Banana", "cherry", "Date");

        boolean containsUppercase = words.stream()
                .anyMatch(word -> !word.equals(word.toLowerCase()));
        if (containsUppercase)
            System.out.println("The list contains at least one uppercase word.");
        else
            System.out.println("The list does not contain any uppercase words.");


//      13. Given a List of integers, write a program to filter out the prime numbers using streams.

//      14. Write a program to check if a List of strings contains any duplicates using streams.

//      15. Given a List of strings, write a program to count the total number of characters in all strings using streams.
    }
}
