package Interfaces;
import Interfaces.Prey;
import Interfaces.Predator;

// The Fish class implements 2 interfaces instead of 1 other class like normal inheritance
public class Fish implements Prey, Predator {

    /* Fish can flee or hunt so we use the "flee()" and "hunt()" method from the Prey AND Predator interface
       Again if the method is not defined here then ALL the other classes implementing the method from the same interface
       will not work.                                                                                                 */

    @Override
    public void flee(){
        System.out.println("The Fish is swimmimg away");
    }

    @Override
    public void hunt(){
        System.out.println("The Fish is hunting");
    }

    // Other methods exculsive to fish(Does not affect the interface or anyother class)
    void fishType(){
        System.out.println("The Fish is a clown fish");
    }

}
