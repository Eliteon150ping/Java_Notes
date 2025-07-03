package Beginner;
import Beginner.Prey;

public class Rabbit implements Prey {

    // Rabbits only flee so we use the "flee()" method from the Prey interface
    // Again if the method is not defined here then ALL the other classes implementing the method from the same interface
    // will not work
    @Override
    public void flee(){
        System.out.println("The Rabbit is running");
    }
}
