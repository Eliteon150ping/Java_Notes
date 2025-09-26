package Inheritance;

import Inheritance.CarAbstract;

public class Abstract {

    public static void main(String[] args) {

        // Abstract =  	Abstract classes cannot be instantiated, but they can have a subclass(Pretty much prevents the idea from being executed while being vague)
        //              Eg. Cannot buy just 'Vehicle', you need to be specific on what kind of vehicle
        //				abstract methods are declared without an implementation
        //              Eg. Empty mehthods etc.

        //VehicleAbstract vehicle = new VehicleAbstract();   This class cannot be instantiated anywhere since it's now an abstract class
        // CarAbstract is a concrete class -> can be instantiated
        CarAbstract car = new CarAbstract("Toyota", 4);

        car.go();         // from overridden method
        car.stop();       // from overridden method
        car.describe();   // from concrete method in VehicleAbstract
    }
}

/*

                            Abstract classes with concrete methods vs without concrete methods
+-------------------------------+----------------------------------------+---------------------------------------------+
| Feature                       | Abstract class with concrete methods   | Abstract class with only abstract methods   |
+-------------------------------+----------------------------------------+---------------------------------------------+
| Methods                       | Mix of abstract and concrete           | Only abstract methods                       |
| Subclass must implement       | Only the abstract ones                 | All methods                                 |
| Inherits ready-to-use methods?| Yes (the concrete ones)                | No (nothing is implemented yet)             |
| Similar to                    | A partially-completed template         | An interface-like blueprint                 |
+-------------------------------+----------------------------------------+---------------------------------------------+

NB:
1️⃣ “Abstract class that is concrete”
-An abstract class that contains at least one concrete (fully implemented) method.

2️⃣ “Abstract class that is not concrete”
-This is an abstract class with only abstract methods (no concrete methods at all).
-This is essentially a pure template.
-All methods are abstract → all must be implemented by subclasses.
-Still can’t be instantiated.

3️⃣ Why does this matter?
-If you want common code shared by all subclasses → put it in a concrete method inside the abstract class.
-If you want only a blueprint (no code yet) → make all methods abstract.

Visual Analogy:
Think of an abstract class like a recipe book:

-If it’s full of just abstract methods, it’s like a book with only titles of recipes (“Make Pasta”) but no instructions.
Subclasses must fill in all the steps.

-If it has concrete methods, it’s like a book where some recipes are already written (“Make Pasta – boil water, add salt…”)
and others are just placeholders. Subclasses can use the finished recipes directly.

*/
