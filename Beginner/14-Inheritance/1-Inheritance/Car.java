package Beginner;

import Beginner.Vehicle;

// 'Car' class is a subclass of 'vehicle' class. It inherites all its attributes and methods.
public class Car extends Vehicle{    // Use 'extends' keyword to show that the class is inheriting from another class followed the the parent class

    int wheels = 4;                  // Here you can make unique attributes and methods just for this class while using the universal attributes and methods from the parent class
                                     // like 'go' and 'stop'.

    int doors = 4;                    // Since a car has 4 wheels and doors(can vary per body type), these will remain unique to just the 'car' class since bicycles don't have 4
                                     // wheels and doors

    // Car constructor explicitly calls parent constructor
    public Car(){
        super(); // Calls Vechicle's constructor
        System.out.println("Car Constructor called");
    }

    public void bodyType(){          // This method will only work from this class

        System.out.println("This car is a sedan and it has 4 wheels");
    }

    @Override                                              // Used for method overriding
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
