import java.util.Scanner;

public class VowelOfConsonant {
    // 3. Write a Java program that takes the user to provide a single character from the
    //alphabet. Print Vowel of Consonant, depending on the user input. If the user input
    //Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
    //error message.
    //For eg:
    //Input an alphabet: p
    //Expected Output:
    //Input letter is Consonant

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Input an alphabet:");
        ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("\nIt is a vowel");
        } else {
            System.out.println("\nIt is a Constant");
        }

    }
}