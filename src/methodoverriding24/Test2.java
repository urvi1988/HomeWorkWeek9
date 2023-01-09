package methodoverriding24;
//Test class to create objects and call the methods
public class Test2 { // main class
    public static void main(String[] args) { // main method

    SBI s = new SBI(); // create an object
    ICICI i = new ICICI();
    Axis a = new Axis();
         System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); // print statment
         System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
         System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
}
}
