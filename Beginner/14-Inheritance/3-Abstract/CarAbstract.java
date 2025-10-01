package Inheritance;

import Inheritance.VehicleAbstract;

public class CarAbstract extends VehicleAbstract{

    int doors;

    // Constructor in subclass calling super()
    public CarAbstract(String brand, int doors){
        super(brand);                                                    // Calls the VehicleAbstract constructor
        this.doors = doors;
    }

    @Override
    void go() {                                                          /* The 'go()' method is inherited here and
                                                                            overrided to do something here.           */

        System.out.println("You're driving the car with " + doors + " doors. ");

    }

    @Override
    void stop(){
        System.out.println("You're stopping");

    }
}
