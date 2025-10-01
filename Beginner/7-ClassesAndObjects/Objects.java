package ClassesAndObjects;

public class Objects {

    // Hardcoded values(Though writing a constructor will make putting values easier, more on that later)
    String name = "Junior Duke";
    int custID = 1205;
    String address = "11 somewhere street";                                           // Fields(Properties)
                                                                                      // (Attributes)
    int orderNum = 69;
    int age = 19;

    public void displayCustomer(){                                  // Methods(Behaviors)
        System.out.println("The method Customer's name is: "+name);
    }

    public static void main(String[] args) {

        // Create an object of the "Objects" class
        // Enter The class name(Right at the top) followed by a variable name then "= new className"

        // <class name> variable = new <class name>(); --> syntax
        Objects object1 = new Objects();                                   /* NB: these can be exported to different
                                                                              files in the directory by typing this same
                                                                              syntax(check the "Class" file  to see how
                                                                              its imported).                          */

        // Use the "." Operator to access fields and methods of an object.
        System.out.println(object1.name); // Can print out the name like this or...

        // Use the object's methods
        object1.displayCustomer();        // ...through a method

    }
}


/*

NB: An object is an instance of a class.

Characteristics of Objects:

Objects are physical or conceptual(something you cannot physically touch).

• Objects have properties:

– Size
– Shape
– Name
– Color

• Objects have behaviors:

– Shop
– Put item in cart
– Pay

Eg:

| Properties         | Behaviors                |
|--------------------|--------------------------|
| Name               | Shop                     |
| Address            | Set Address              |
| Age                | Add item to cart         |
| Order number       | Ask for a discount       |
| Customer number    | Display customer details |


*/