package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10);
        // external iterators
//        for(int i = 0; i<number.size(); i++){
//            System.out.println(number.get(i));
//        }
        // external iterators also

//        for(int e : number){
//            System.out.println(e);
//        }

        // internal iterators
//        number.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer value) {
//                System.out.println(value);
//            }
//        });

//        number.forEach((Integer value) ->System.out.println(value));

//        number.forEach((value) -> System.out.println(value));
        //Java 8 has type inference, finally, hold your tweets but only for lamda expressions.

        // number.forEach(value -> System.out.println(value));
        // parenthesis is optional, but only for one parameter lambdas.

//        number.forEach(System.out::println);
        // While lambdas are really cute, keep them that way.

//        number.stream()
////                .map(e -> String.valueOf(e))
//                .map(String::valueOf)
//                .forEach(System.out::println);


        System.out.println(
                number.stream()
//                        .reduce(0,(total, e) -> Integer.sum(total,e))
                        .reduce(0, Integer::sum)
        );

        // Given the values, double the even numbers and total.

        int result = 0;
        for(int e : number)
        {
            if(e%2 == 0){
                result += e * 2;
            }
        }
        System.out.println(result);
        System.out.println(
            number.stream()
                    .filter(e -> e % 2 == 0)
                    .mapToInt(e -> e * 2)
                    .sum());
        
    }
}
