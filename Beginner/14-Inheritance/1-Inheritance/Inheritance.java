package Beginner;

import Beginner.Car;
import Beginner.Bicycle;
import Beginner.Boat;


public class Inheritance {

    public static void main(String[] args) {

        // inheritance = 	the process where one class acquires,the attributes and methods of another.

        Car car = new Car(); // Create a car object

        car.go();            // Car object uses the 'go()' method from the parent 'Vehicle' class
        car.stop();          // Car object uses the 'stop()' method from the parent 'Vehicle' class
        car.bodyType();      // Car object uses the 'bodytype()' method from its own 'Car' class

        Bicycle bike = new Bicycle(); // Create a bicycle object

        bike.go();             // bike object uses the 'go()' method from the parent 'Vehicle' class
        bike.stop();           // bike object uses the 'stop()' method from the parent 'Vehicle' class
        bike.bicycle();        // bike object uses the 'bicycle()' method from its own 'bike' class

        System.out.println(car.doors);   // Print the attributes from the 'car' class  // NB: The 'bicycle()' method from the 'bike' class will NOT work for the 'car' class
        System.out.println(bike.pedals); // Print the attributes from the 'bike' class  // NB: The 'doors()' method from the 'car' class will NOT work for the 'bike' class


    }
}
