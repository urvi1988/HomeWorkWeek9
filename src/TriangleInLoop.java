import java.util.Scanner;

public class TriangleInLoop {
    // 6. Display right angle triangle of @ using nested for loops @


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int height;
        String c;

        System.out.println("Enter the height of triangle:");
        height=sc.nextInt();

        System.out.println("Enter the character to print triangle");
        c=sc.next();
        System.out.println();

        for(int i=1; i<=height;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(c+"");
            }
            System.out.println();
        }


    }
}

