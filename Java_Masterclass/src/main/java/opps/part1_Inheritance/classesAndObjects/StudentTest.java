package opps.part1_Inheritance.classesAndObjects;

public class StudentTest {
    public static void main(String[] args) {

        for(int i = 0; i<5; ++i){
            Student student = new Student(
                    1 + i,
                    switch(i){
                    case 0 -> "Abhi";
                    case 1 -> "Raj";
                    case 2 -> "Ram";
                    case 3 -> "Amit";
                    case 4 -> "Sumit";
                    default -> "Anonymous";
                },
                    switch(i){
                        case 0 -> "12/02/2001";
                        case 1 -> "12/03/2001";
                        case 2 -> "15/02/2001";
                        case 3 -> "12/06/2001";
                        case 4 -> "12/07/2001";
                        default -> "12/08/2001";
                    },
                    switch(i){
                        case 0 -> "Algo";
                        case 1 -> "C";
                        case 2 -> "DSA";
                        case 3 -> "C++";
                        case 4 -> "Java";
                        default -> "Math";
                    }
            );
            System.out.println(student);
        }

        for(int i = 0; i<5; ++i){
            DStudent student = new DStudent(
                    1 + i,
                    switch(i){
                        case 0 -> "Abhi";
                        case 1 -> "Raj";
                        case 2 -> "Ram";
                        case 3 -> "Amit";
                        case 4 -> "Sumit";
                        default -> "Anonymous";
                    },
                    switch(i){
                        case 0 -> "12/02/2001";
                        case 1 -> "12/03/2001";
                        case 2 -> "15/02/2001";
                        case 3 -> "12/06/2001";
                        case 4 -> "12/07/2001";
                        default -> "12/08/2001";
                    },
                    switch(i){
                        case 0 -> "Algo";
                        case 1 -> "C";
                        case 2 -> "DSA";
                        case 3 -> "C++";
                        case 4 -> "Java";
                        default -> "Math";
                    }
            );
            System.out.println(student);
        }
    }
}
