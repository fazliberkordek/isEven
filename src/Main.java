import java.util.Scanner;

/**
 * @author fazliberkordek
 */
// Find the even numbers in the users input:

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i = 0;
        System.out.print("Type the number : ...");
        num = input.nextInt();
        //While solution:
        System.out.println("While solution......");
        while (i <= num) {

            if (i % 2 == 0) {
                System.out.println(i + " is even  ");
            } else {
                System.out.println(i + " is not even");
            }
            ++i;
        }
        //For solution:
        System.out.println("The For solution........");
        for (int k = 0; k <= num; k++) {
            if (k % 2 == 0) {
                System.out.println(k + " is even");
                continue;
            } else {
                System.out.println(k + " is odd");
            }
        }

    }

}





