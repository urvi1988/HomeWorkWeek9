package JavaPrograms;

import java.util.ArrayList;

public class YourName { // class name
    public static void main(String[] args) { // predefine method
        ArrayList<String> Groupmember= new ArrayList<>();  // define list for group member
        Groupmember.add("Urvi");
        Groupmember.add("Bhumi");
        Groupmember.add("Kuldip");
        Groupmember.add("Soniya");
        Groupmember.add("Dipali");
        System.out.println("ArrayList:" + Groupmember);

        System.out.println("Itrating over ArrayList using for each loop"); //  print statment

        for (String name: Groupmember);
        {
            System.out.println("Urvi");
        }

    }
}
