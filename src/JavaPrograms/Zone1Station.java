package JavaPrograms;

import java.util.HashMap;
// 8. Write the program that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

public class Zone1Station {
    public static void main(String[] args) { // main method

        HashMap<String,String>Railwayline= new HashMap<String,String>(); // create hasmap object

        Railwayline.put("Wembley","Bakerloo line"); // add key and value
        Railwayline.put("Kingcross","Victoria line");
        Railwayline.put("Wembleypark","Metro line");
        Railwayline.put("Covent Garden","Picadilly line");
        Railwayline.put("Kingbury","Jubeliee line");

        System.out.println("Station and Lines in Zone1:"); // print station name and line name
        System.out.println(Railwayline);

    }
}