package JavaPrograms;

import java.util.HashMap;

//7. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.
public class People { // class name

    public static void main(String[] args) { // main method
        HashMap<String,Integer>people=new HashMap<String,Integer>(); // create HasMap object called people

        people.put("Urvi",32); // Add keys and values(name and age)
        people.put("Bhumi",33);
        people.put("Kuldip",28);
        people.put("Dipali",40);
        people.put("Soniya",36);

        for (String i: people.keySet()){  // for loop method
            System.out.println("key:"+i+"value:"+people.get(i));
        }
    }
}
