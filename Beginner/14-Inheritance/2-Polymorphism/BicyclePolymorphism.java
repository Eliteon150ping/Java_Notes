package Inheritance;

import Inheritance.VehiclePolymorphism;


public class BicyclePolymorphism extends VehiclePolymorphism{

    @Override
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
