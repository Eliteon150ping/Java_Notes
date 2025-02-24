package Beginner;

//  This class cannot be instantiated anywhere since it's now an abstract class but its children/subclass can use these methods and override them.
public abstract class VehicleAbstract {

    // The parent/superclass has methods that are empty but can be overriden and used in other subclasses

    abstract void go();                 // Bodies '{}' are not defined here for these methods
    abstract void stop();
    
}

/*

NB:
Abstract classes can have constructors, including parameterized constructors.
Abstract methods can have parameters, and subclasses must implement them.
You cannot instantiate an abstract class directly, but subclasses can call the constructor using super().

*/