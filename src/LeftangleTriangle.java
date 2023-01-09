public class LeftangleTriangle {
    //8. Display left angle triangle of * using nested for loops

    public static void main(String[] args) {
        int rows=5;
        for (int x=1;x<=rows;x++) {
            for (int i=1;i<=x;i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}


