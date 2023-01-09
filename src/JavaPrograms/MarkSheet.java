package JavaPrograms;
// 2. Rewrite the student mark sheet program using if else and while loop.

import java.util.Scanner;

public class MarkSheet { // class name

    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Marksheet"); // print statment
        int English, Maths, Science;
        System.out.println("Enter Student name :");
        String name = sc.next();
        System.out.println("Enter student Roll No");
        String no = sc.next();
        System.out.println("Enter subject and marks");
        System.out.println("Enter marks for English:");
        int E = sc.nextInt();
        System.out.println("Enter marks for Maths:");
        int M = sc.nextInt();
        System.out.println("Enter marks for Science");
        int S = sc.nextInt();

        float sum = E + M + S;  // float method
        System.out.println("Total marks" + sum);
        int total = 300;

        float percentage = sum / total * 100;
        System.out.println("Percentage" + percentage);


        if (percentage > 80) {  // if else method
            System.out.println("Grade : A");
        } else if (percentage >= 60) {
            System.out.println("Grade : B");
        } else if (percentage >= 45) {
            System.out.println("Grade : C");
        } else if (percentage >= 35) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Fail");
        }
        while (percentage < 35) {  // while loop method
            System.out.println("not pass");
            break;
        }
    }
    }

