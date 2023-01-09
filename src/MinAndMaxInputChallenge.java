import java.util.Scanner;
// 2. -Read the numbers from the console entered by the user and print the
//minimum and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int count=0;
        int min=0;
        int max=0;
        boolean first = true;

        while (true){
            System.out.println("Enter Number");
            boolean hasNextInt= sc.hasNextInt();

            count+=1;
            if(hasNextInt) {

                int storedNumber = sc.nextInt();

                if(first){
                    first = false;
                    min = storedNumber;
                    max = storedNumber;
                }

                if(storedNumber > max) {
                    max = storedNumber;
                }

                if(storedNumber < min) {
                    min = storedNumber;
                }

                if(count == 5) {
                    break;
                }
            } else {

                System.out.println("Invalid number");
                break;
            }
            sc.nextLine(); // Handle nextline input (?) QUESTION
        }
        System.out.println("The minimum number of this: " + min);
        System.out.println("The maximum number of this: " + max);

            sc.close();

    }

}



