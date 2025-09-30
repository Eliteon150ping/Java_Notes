package MethodsAndConstructors;

public class Constructors {

    public static void main(String[] args) {

        Constructors DefaultConstructor = new Constructors();  // Default constructor is called
        Constructors NoArgsConstructor = new Constructors();   // No args constructor is called
        Constructors AllArgsConstructor = new Constructors("This is the Parameterized Constructor's doing ",3);
        // Parameterized Constructor is called

        System.out.println(AllArgsConstructor.Param + "and its number is " + AllArgsConstructor.ParamNum);

    }

    // 1) Default Constructor:
    // No constructor defined here, so Java provides a default one

    // 2) No-Argument Constructor:
    public Constructors() {
        System.out.println("Constructors created");
    }

    // 3) Parameterized Constructor:            // These will have declared but not initialized variables.
    String Param;
    int ParamNum;

    public Constructors(String Param, int ParamNum) {  // The params will act as tempo variables that will take any
                                                       // value(In this case a string and integer)
        this.Param = Param        /* The left side with "this.Param" is using the declared variable in line 25 while
                                     the right side "Param" is using the arg value passed into the parameter          */                                                                                                                                                                                                      ;
        this.ParamNum = ParamNum; // "This" keyword is a reference to the current object.

    }

    // Constructor chaining
   /* public Constructors() {
        this("Default Parameter", 0); // Calls the parameterized constructor     The "this()" is used to call the
                                                                                 Parameterized constructor below in this
                                                                                 one.
        System.out.println("No-argument constructor called");
    }

    public Constructors(String Param, int ParamNum) {
        this.Param = Param;
        this.ParamNum = ParamNum;
        System.out.println("Parameterized constructor called");
    }
    */
}
class SameConstructor{

    public static void main(String[] args) {

        SameConstructor obj = new SameConstructor();
        SameConstructor obj2 = new SameConstructor("Hello",1);
        SameConstructor obj3 = new SameConstructor("Java",2);

        obj.display();
        obj2.display();
        obj3.display();
    }

    // Using the Same Constractor for different purposes
    String message;
    int number;

    // No-Argument constructor
    public SameConstructor(){
        message = "Default message";
        number = 0;
        System.out.println("No-argument constructor called");
    }

    // Parameterized constructor
    public SameConstructor(String message,int number){
        this.message = message;
        this.number = number;
        System.out.println("Parameterized constructor called");
    }

    // Display method used for the constructors
    public void display(){
        System.out.println("Message: " + message + " Number: " + number);
    }

}

class StaticVsInstance {

    // Static variable (shared by all objects of the class)
    static int objectCount = 0;

    // Instance variable (unique for each object)
    String name;

    // Constructor
    public StaticVsInstance(String name) {
        this.name = name;
        objectCount++; // increments shared static variable
    }

    public void display() {
        System.out.println("Name: " + name + " | Object Count: " + objectCount);
    }

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance("First");
        StaticVsInstance obj2 = new StaticVsInstance("Second");
        StaticVsInstance obj3 = new StaticVsInstance("Third");

        obj1.display();
        obj2.display();
        obj3.display();

        // Notice objectCount is shared by all instances
        System.out.println("Total objects created: " + StaticVsInstance.objectCount);
    }


}

/*

NB:

• A constructor in Java is a special method used to create (or initialize) objects.
  It’s like a blueprint that helps you set up your object with default or specific values right when it's created.

• A constructor has the same name as the class it belongs to.(Eg: If the class name is "Car", the constructor will also
  be named "Car").
• Constructors don’t have a return type, not even "VOID".
• A constructor is called automatically when you create an object using the new keyword.
• It is called by using the new keyword.


Types of Constructors:

1) Default Constructor:

• Provided by Java automatically if no constructor is defined.
• It doesn’t do anything except create the object.

2) No-Argument Constructor:

• A custom constructor with no parameters.

3) Parameterized Constructor:

• A constructor that takes arguments to initialize an object with specific values.
• The "this" keyword in Java refers to the current object —
  the instance of the class that is executing a method or constructor.
  It's like a pointer to the object itself, allowing you to access its members (variables, methods) from within the
  class.

• "This()" can also be used to call one constructor from another within the same class (constructor chaining),usually
  defined in a constructor to call the other constructor.


When a "static" keyword modifier is applied to a method or variable.
It means the method/variable:

• Belongs to the class and is shared by all objects of that class
• Is not unique to an object instance
• Can be accessed without instantiating the class

Static vs Instance Variables
• A Static variable is shared by all objects in a class.
• An Instance variable is unique to an individual object.

*/