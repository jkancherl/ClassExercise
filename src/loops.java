import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        //for (int i=1;  i<=10; i++)
        //System.out.print(i);


        // for (int j=10;  j>=1; j++)
        //     System.out.print(j);


//        for (int i = 1; i < 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//
//            }
//        }

//        for (int i = 1; i < 20; i++) {
//           if (i % 2 == 0) {
//               System.out.println(i);}}

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();
//        int sum = 0;
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}