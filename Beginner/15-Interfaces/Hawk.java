package Beginner;
import Beginner.Predator;

public class Hawk implements Predator {

    // Hawks only hunt so we use the "hunt()" method from the Predator interface
    // Again if the method is not defined here then ALL the other classes implementing the method from the same interface
    // will not work
    @Override
    public void hunt(){
        System.out.println("The Hawk is hunting");
    };
}
