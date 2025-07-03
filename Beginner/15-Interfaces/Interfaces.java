package Beginner;

import Beginner.Hawk;
import Beginner.Rabbit;
import Beginner.Fish;

public class Interfaces {
    public static void main(String[] args) {

       // Interfaces = A blueprint for a class that specifies a set of abstract methods that implementing classes
       //              MUST define.
       //              Unlike normal inheritance, using interfaces will allow for a class to have multiple parent classes(eg.2 or more)

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
