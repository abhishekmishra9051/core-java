package practics;

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
    }
}
