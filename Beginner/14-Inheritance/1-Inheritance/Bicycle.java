package Inheritance;

import Inheritance.Vehicle;

// 'Bicycle' class is a subclass of 'vehicle' class. It inherites all its attributes and methods.
public class Bicycle extends Vehicle{  // Use 'extends' keyword to show that the class is inheriting from another class followed the the parent class

    int wheels = 2;                    // Here you can make unique attributes and methods just for this class while using the universal attributes and methods from the parent class
                                       // like 'go' and 'stop'.


    int pedals = 2;                     // Since a bicycle has 2 wheels and no doors, these will remain unique to just the 'bicycle' class since cars have 4
                                        // wheels and doors

    public Bicycle(){
        super(); // Calls Vehicle constructor
        System.out.println("Bicycle Constructor called");
    }

    public void bicycle() {
        System.out.println("Bicycle has " + wheels + " wheels and " + pedals + " pedals");
    }


    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
