package configuration;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle object created");
    }

    public void moving() {
        System.out.println("Vehicle is moving (init method)");
    }

    public void accident() {
        System.out.println("Vehicle met with an accident (destroy method)");
    }
}