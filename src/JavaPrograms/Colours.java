package JavaPrograms;
// 3. Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.

import java.util.ArrayList;
import java.util.List;

public class Colours { // class name
    public static void main(String[] args) { // main method
        List<String> list_Strings= new ArrayList<String>(); // create object

        list_Strings.add("Red"); //  create list and add some colour in the list
        list_Strings.add("Pink");
        list_Strings.add("Yellow");
        list_Strings.add("Blue");
        list_Strings.add("Green");

        for (String elements: list_Strings){ // print the list of elements
            System.out.println(elements);
        }

    }

}
