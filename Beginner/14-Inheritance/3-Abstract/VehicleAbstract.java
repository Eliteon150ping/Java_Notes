package Inheritance;

//  This class cannot be instantiated anywhere since it's now an abstract class but its children/subclass can use these
//  methods and override them.
public abstract class VehicleAbstract {

    String brand;

    // Constructor
    public VehicleAbstract(String brand){
        this.brand = brand;
        System.out.println("Vechicle Abstract constructor called for: " + brand);
    }

    // The parent/superclass has methods that are empty but can be overriden and used in other subclasses
    abstract void go();                 // Bodies '{}' are not defined here for these methods
    abstract void stop();

    // Concrete method(subclasses inherit it as-is)
    public void describe(){
        System.out.println("This is a vehicle of brand: " + brand);
    }
    
}

/*

NB:
Abstract classes can have constructors, including parameterized constructors.
Abstract methods can have parameters, and subclasses MUST implement them.
You cannot instantiate an abstract class directly, but subclasses can call the constructor using super().

If an abstract class contains abstract methods, any concrete subclass (a non-abstract class) must override and provide implementations for ALL the abstract methods.
However, if a subclass is also declared abstract, it is not required to implement the abstract methods from the parent class.

*/