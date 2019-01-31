public class Comments {
    /*
     *  Comments Example Program
     *  Dave Wolf
     *  July 21st, 2015
     */

    //import java.util.Random;
//import java.util.Scanner;

//    public class CommentsEverywhere
//    {
//        public static void main( String[] args )
//        {
//            // This line will be ignored by the compiler
//            // but people will (hopefully) read it.
//            // Anything after the // is ignored by Java.
//            System.out.println( "This line prints just fine." ); // I can include a comment after the working code..
//            // This next line of code has been disabled by a comment:
//            // System.out.println("This line won't print.");
//            System.out.println( "This line also prints just fine." );
//        }
//    }
//    /*
//     *
//     */
/*
    public class Main
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            //
            Random random = new Random();
            long from = 1;
            long to = 100;
            int randomNumber = random.nextInt(to - from + 1) + from;
            //
            int guessedNumber = 0;

            //
            System.out.printf("The number is between %d and %d.\n", from, to);

            //
            do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            } while (guessedNumber != randomNumber);
        }
    }

*/
}
