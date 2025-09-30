package Inheritance;

// This is the super/parent class, all the attributes and methods from this class will work for any of its inheritents
// like the 'car' and 'bicycle' class
public class Vehicle {

    double speed;

    // Constructor
    public Vehicle(){
        System.out.println("Vehicle Constructor called");
    }

    void go(){

        System.out.println("This vehicle is moving");
    }
    void stop(){

        System.out.println("This vehicle is stopped");
    }
}
/*

Benefits:

1. There is less code
duplication.

2. Code modification can be
done once for all subclasses.

*/