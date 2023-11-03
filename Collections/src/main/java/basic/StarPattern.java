package basic;

public class StarPattern {
    public static void main(String[] args){
        int row, numberOfStars;
        for(row =10; row >=1; row--){
            for(numberOfStars =1; numberOfStars <= row; numberOfStars++)
                System.out.print("*"+" ");
            System.out.println();
        }

    }
}
