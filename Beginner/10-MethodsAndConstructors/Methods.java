package MethodsAndConstructors;

public class Methods {

    public static void main(String[] args) {

        // Calling the method to execute
        hello();


        // Method overloading
        int totalOne = Methods.sum2(2, 3);                       // For int
        System.out.println("The total is " + totalOne);

        float totalTwo = Methods.sum2(15.99F, 12.85F);           // For float
        System.out.println(totalTwo);

        float totalThree = Methods.sum2(2, 12.85F);              // For int and float
        System.out.println(totalThree);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    // This is a "void" method(does not return any value)
    public static void hello() {               // There are no parameters in "()".
        System.out.println("Hello");

    }

    // This is a "return" method(returns a String value)
    public String returnString() {
        return ("Hello");
    }

    // This is a "return" method(returns a added integer value)
    public int sum(int x, int y) {
        return (x + y);
    }

    // This is a "return" method(returns a boolean(true or false) value)
    public boolean isGreater(int x, int y) {
        return (x > y);
    }

    // NB: Return methods DO NOT have the void keyword and requires the data type returned eg: integer, string, boolean etc.


    // Method Overloading
    public static int sum2(int num1, int num2) {                     // Name of the method is the same for all 3.

        System.out.println("Method One");                            // This returns int values
        return num1 + num2;
    }

    public static float sum2(float num1, float num2) {               // This returns float values
        System.out.println("Method Two");
        return num1 + num2;
    }

    public static float sum2(int num1, float num2) {                 // This returns int and float values
        System.out.println("Method Three");
        return num1 + num2;
    }

}
/*

NB:

• Methods are like functions in JavaScript that only execute when they are called.
• In java all methods have to be declared outside the main method to avoid any error.
• Nested methods(More then 1 method in a method) will NEVER work in java.
• The "void" keyword means the method will not return a value.

When a static modifier is applied to a method or variable.
It means the method/variable:

• Belongs to the class and is shared by all objects of that class
• Is not unique to an object instance
• Can be accessed without instantiating the class


1) Public Methods or Classes:

• Accessible from anywhere if the class or file is imported.
  Example: If a method is public, any other object in any class can call it (provided access via instance or static context).

2) Non-Public Methods or Classes:

• Default (package-private) methods and classes are only accessible within the same package.
  Example: If a method has no modifier, only classes in the same package can use it.

3) Private Methods or Fields:

• private members are only accessible within the SAME CLASS.

Static and Public Together:

When you combine static and public, you create a method or field that:

• Can be accessed without creating an object, directly through the class name.
• Is accessible everywhere (from any class or file), as long as the class is visible and imported

NB: When the method is not static, so you must create an object

/////////////////////////////////////////////////////

In simple terms:

• The "static" keyword controls HOW the method is accessed (via class vs. object).
• The "public" keyword controls WHO can access it (from any class or package).
• IF a "static" method is NOT PUBLIC, it cannot be accessed from classes in other files, regardless of whether it’s static.

////////////////////////////////////////////////////

method overloading:

• Have the same name
• Have different signatures:

– The number of parameters
– The types of parameters
– The order of parameters

• May have different functionality or similar functionality
• Are widely used in the foundation classes


*/