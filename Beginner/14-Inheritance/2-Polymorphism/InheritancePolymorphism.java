package Inheritance;

import Beginner.*;
import Inheritance.BicyclePolymorphism;
import Inheritance.Boat;
import Inheritance.CarPolymorphism;
import Inheritance.VehiclePolymorphism;


public class InheritancePolymorphism {

    public static void main(String[] args) {

        /* Polymorphism = 	The ability of an object to identify as more than one type/more than itself (greek word for
                            poly-"many", morph-"form").
                            Eg. Think a dog. It identifies as a dog(itself), also as a animal and as an organism thus
                            taking 3 forms.                                                                           */


        CarPolymorphism car = new CarPolymorphism();                        // Create a car object
        BicyclePolymorphism bicycle = new BicyclePolymorphism();            // Create a bicycle object
        Boat boat = new Boat();                                             // Create a boat object


        VehiclePolymorphism[] racers = {car,bicycle,boat};

        for(VehiclePolymorphism x : racers) {
            x.go();
        }

        // Instanceof Operator
        // Checks if an object is an instance of a superclass or an interface it implements(Returns True or False).
        // For a null object, the operator returns false rather than throwing an exception.

        VehiclePolymorphism Vehicle = new VehiclePolymorphism();

        System.out.println(car instanceof CarPolymorphism);           // True
        System.out.println(bicycle instanceof BicyclePolymorphism);   // True
        System.out.println(boat instanceof VehiclePolymorphism);      // True
        System.out.println(Vehicle instanceof BicyclePolymorphism);   /* False(This happens because the 'Vehicle' object
                                                                         of the Superclass 'VehiclePolymorphism' is NOT
                                                                         an instance of any of the subclasses hence
                                                                         false is returned).                          */

        // Upcasting and downcasting

        // Upcasting (Car -> Vehicle)
        VehiclePolymorphism v1 = new CarPolymorphism();
        v1.go();                                                     // Calls CarPolymorphism's go() at runtime

        // Downcasting (Vehicle -> Car)
        if(v1 instanceof CarPolymorphism) {
            CarPolymorphism c1 = (CarPolymorphism) v1;
            c1.go();

        }

        // Unsafe downcasting
        VehiclePolymorphism v2 = new VehiclePolymorphism();
        if(v2 instanceof CarPolymorphism) {
            CarPolymorphism c2 = (CarPolymorphism) v2;               // Won't run because check fails
            c2.go();

        }else{
            System.out.println("v2 is not a Car, downcast not allowed");
        }
    }
}

/*

NB: This can also work through interfaces(More on that later), just create "VehiclePolymorphism" file an interface file
    and declare an basic method

*/