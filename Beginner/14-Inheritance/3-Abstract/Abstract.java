package Beginner;

import Beginner.CarAbstract;

public class Abstract {

    public static void main(String[] args) {

        // Abstract =  	Abstract classes cannot be instantiated, but they can have a subclass(Pretty much prevents the idea from being executed while being vague)
        //              Eg. Cannot buy just 'Vehicle', you need to be specific on what kind of vehicle
        //				abstract methods are declared without an implementation
        //              Eg. Empty mehthods etc.

        //VehicleAbstract vehicle = new VehicleAbstract();   This class cannot be instantiated anywhere since it's now an abstract class
        CarAbstract car = new CarAbstract();

        car.go();
    }
}
