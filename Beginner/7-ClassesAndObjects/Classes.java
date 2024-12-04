package ClassesAndObjects;

import ClassesAndObjects.Objects; // Be sure to import the file if its in a PACKAGE for it to work


// Class declaration
public class Classes {

    public static void main(String[] args) {

        // This was imported from the "Objects" file
        Objects object1 = new Objects();
        System.out.println(object1.custID);

        object1.displayCustomer();

    }
}

/*

Classes and Instances

• A class:

– Is a blueprint or recipe for an object
– Describes an object’s properties and behaviors
– Is used to create object instances

*/