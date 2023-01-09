package Calculate;

import java.util.Scanner;
import static Calculate.Calculator.calculateResult;

public class Main { // declare class
    public static void main(String[] args) { // deaclare main method
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number"); // print statement
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println("Please enter one operator(+,-,*,/,%)-");
            char op = sc.next().charAt(0);
            calculateResult(a, b, op);

            System.out.println("would you like to do more calculation?: y or n:");
            c = sc.next().charAt(0);
        } while (c=='Y' || c=='y');

    }
}
