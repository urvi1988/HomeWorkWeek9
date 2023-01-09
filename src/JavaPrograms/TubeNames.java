package JavaPrograms;

import java.util.ArrayList;

//5. Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class TubeNames { // class name
    public static void main(String[] args) { // predefine method
        ArrayList<String>names = new ArrayList(); // create an object
        names.add("Bakerloo line");
        names.add("Circle line");
        names.add("Metro line");
        names.add("Jubliee");
        names.add("National Railway");
        System.out.println("Original Array list:"+ names); // print the array list
        System.out.println("Checking above array list is empty or not:"+ names.isEmpty());// will check if array is empty or not

    }
}
