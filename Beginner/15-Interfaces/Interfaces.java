package Interfaces;

import Interfaces.Hawk;
import Interfaces.Rabbit;
import Interfaces.Fish;

public class Interfaces {
    public static void main(String[] args) {

       // Interfaces = A blueprint for a class that specifies a set of abstract methods that implementing classes
       //              MUST define.
       //              Unlike normal inheritance, using interfaces will allow for a class to have multiple parent classes
       //              (eg.2 or more)

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}

/*

NB: When to Use a Interface over Class Inheritance...
✅Use Interface when:

-You want to define a contract for unrelated classes (e.g., Car, Drone → Movable)
-You need multiple inheritance of types
-You want to ensure loose coupling

✅Use Inheritance (Class) when:

-There is a natural "is-a" relationship (e.g., Dog extends Animal)
-You want to reuse code from the superclass
-You're building a class hierarchy

✅Implicit modifiers

-All interface methods are automatically PUBLIC ABSTRACT(even if you don't write it).
-All variables in an interface are automatically PUBLIC STATIC FINAL(constants).
-You can still write the modifiers explicitly for clarity.

✅Multiple Interitance

-A class can implement more than one interface:

eg. class MyClass implements InterfaceA,InterfaceB{

               code here...

    }

-This is how Java gets “multiple inheritance” of types (not of implementation).

✅Implementation Requirement

-Any concrete(non-abstract) class must override all abstract methods from the interface,
If you don't, your class must be declared ABSTRACT.

✅Polymorphism with Interfaces

-You can use an interface as a reference type:

prey rabbit = new rabbit(); --> Interface reference
rabbit.flee();

-This is powerful for writing flexible code

✅Abstract class vs Interface:

+--------------------------+-----------------------------+-----------------------------+
| Feature                  | Abstract Class             | Interface                    |
+--------------------------+-----------------------------+-----------------------------+
| Instantiation            | Cannot be instantiated     | Cannot be instantiated       |
+--------------------------+----------------------------+------------------------------+
| Inheritance/Implements   | Extend (only one allowed)  | Implement (multiple allowed) |
+--------------------------+----------------------------+------------------------------+
| Methods                  | Can have abstract +        | All methods are abstract by  |
|                          | concrete methods           | default (Java 7); from Java8 |
|                          |                            | can have default & static    |
+--------------------------+----------------------------+------------------------------+
| Fields                   | Can have instance vars,    | Only public static final     |
|                          | constructors, constants    | constants (no instance vars) |
+--------------------------+----------------------------+------------------------------+
| Access Modifiers         | Can use public/protected/  | Methods implicitly public    |
|                          | private for methods        | (until Java9 modules)        |
+--------------------------+----------------------------+------------------------------+
| State (Fields)           | Yes (instance state)       | No (no instance state)       |
+--------------------------+----------------------------+------------------------------+
| Purpose                  | Base class + partial impl. | Contract/blueprint for class |
+--------------------------+----------------------------+------------------------------+
| Multiple inheritance     | No                         | Yes (can implement many)     |
+--------------------------+----------------------------+------------------------------+


*/
