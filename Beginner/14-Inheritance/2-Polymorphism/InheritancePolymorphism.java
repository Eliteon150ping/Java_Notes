package Beginner;

import Beginner.CarPolymorphism;
import Beginner.BicyclePolymorphism;
import Beginner.Boat;
import Beginner.VehiclePolymorphism;


public class InheritancePolymorphism {

    public static void main(String[] args) {

        // Polymorphism = 	The ability of an object to identify as more than one type/more than itself (greek word for poly-"many", morph-"form")
        //                  Eg. Think a dog. It identifies as a dog(itself), also as a animal and as an organism thus taking 3 forms.


        CarPolymorphism car = new CarPolymorphism(); // Create a car object
        BicyclePolymorphism bicycle = new BicyclePolymorphism(); // Create a bicycle object
        Boat boat = new Boat(); // Create a boat object


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
        System.out.println(Vehicle instanceof BicyclePolymorphism);   // False(This happens because the 'Vehicle' object of the Superclass 'VehiclePolymorphism' is NOT an instance
                                                                      // of any of the subclasses hence false is returned)
    }
}

/*

NB: This can also work through interfaces(More on that later), just create "VehiclePolymorphism" file an interface file and declare an basic method



*/