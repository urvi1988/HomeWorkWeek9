package encapsulation26;

public class TestEncapsulation { // class name

    public static void main(String[] args) { // main method
        Encapsulate obj = new Encapsulate(); // setting values of the variables

        obj.setName("Bhavesh"); // Displaying values to the variables
        obj.setAge(19);
        obj.setRollNO(51);

        System.out.println("CodeBusters name: " + obj.getName());   // Direct access of rollNo is not possible due to  encapsulation
        System.out.println("CodeBuster age: " + obj.getAge());
        System.out.println("CodeBuster rollNo: " + obj.getRollNo());
    }
}