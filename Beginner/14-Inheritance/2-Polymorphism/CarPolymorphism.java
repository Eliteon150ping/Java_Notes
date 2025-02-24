package Beginner;

import Beginner.VehiclePolymorphism;


public class CarPolymorphism extends VehiclePolymorphism {


    @Override // Used for method overriding(annotation helps prevent mistakes in overriding.)
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
