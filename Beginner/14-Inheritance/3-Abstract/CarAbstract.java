package Beginner;

import Beginner.VehicleAbstract;

public class CarAbstract extends VehicleAbstract{

    @Override    // The 'go()' method is inherited here and overrided to do something here
    void go() {
        System.out.println("You're driving the car");

    }
}
