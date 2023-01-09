package JavaPrograms;
// 9. Write program and add all group names in to array and iterates through for
//each loop.

import java.util.ArrayList;

public class GroupName { // class name
    public static void main(String[] args) { // main method
        ArrayList<String> Groupname = new ArrayList<>(); // creating array list
        Groupname.add("Selenium");
        Groupname.add("Java");
        Groupname.add("Postname");
        Groupname.add("Gerkin");
        Groupname.add("Restassure");
        System.out.println("ArrayList : " + Groupname); // print group name for each loop

        System.out.println("Iterating over ArrayList using for each loop"); // print statment

            for (String name : Groupname)
            {
                System.out.print(Groupname);
                System.out.print(" ");
                break;
            }

        }

    }
