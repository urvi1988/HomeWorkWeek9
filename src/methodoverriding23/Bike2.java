package methodoverriding23;
class Bike2 extends Vehicle {
    @Override
    public void run() { // instance method
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();// create an object
        obj.run(); // calling method
    }
}
