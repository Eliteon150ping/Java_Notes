package Inheritance;

import Inheritance.VehiclePolymorphism;

public class Boat extends VehiclePolymorphism {

    @Override
    public void go() {
        System.out.println("*The boat begins moving*");
    }

}
