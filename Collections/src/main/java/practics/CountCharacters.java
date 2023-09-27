package practics;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
//import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Abhishek Mishra";
        int  count = 0;
//        for(char ch : str.toCharArray()){
//            if(ch == 'i')
//                count++;
//        }
//        System.out.println(count);

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == 'i')
                count++;
        }
        System.out.println(count);

        Map<String, Long> countMap = Arrays.stream(str.split(""))
                .collect(
                        groupingBy(Function.identity(),counting())
                );
        System.out.println(countMap);
    }


}
