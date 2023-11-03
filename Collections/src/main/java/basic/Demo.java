package basic;

public class Demo {
    public static void main(String[] args) {
//        int[] array = {13, 45, 65, 54, 87, 65};
//        int key = 45;
//       int n = array.length;
//        for(int i=0; i<n; i++){
//            if(array[i] == key){
//                System.out.println(key + " Found");
//                return;
//            }
//        }
//        System.out.println("not found");

        int[] array = {13, 45, 65, 54, 87, 65};
        int n = array.length;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        int result = array[n-1];
        System.out.println(result);
    }
}
