package Variables;

public class Variables {
    // Also Data types(primitive)

    public static void main(String[] args) {

        // Basic variables
        String myString = "This is a string";  // Contains a series of characters
        int myInt = 3;                         // Holds a value from -2^31 to 2^31-1.(32 bits)(–2,147,483,648 to 2,147,483,647, or 4,294,967,296 possible values)
        boolean myBoolean = true;              // Either True or False

        // Advanced variables
        double myDouble = 3.14;                // Holds a decimal number
        char myChar = 'A';                     // Contains a single character with (''). NB: The ascii table displays each char character's value.(a-z:97-122, A-Z:65-90)
        float myFloat = 3.14f;                 // Contains a decimal number with 'f' at the end.(32 bits)(1.40239846e-45f to 3.40282347e+38f)
        byte myByte = 127;                     // Holds a value from -2^7 to 2^7-1.(8 bits)(–128 to 127, or 256 possible values)
        short myShort = 1234;                  // Holds a value from -2^15 to 2^15-1.(16 bits)(–32,768 to 32,767, or 65,535 possible values)
        long myLong = 1234567890L;             // Holds a value from -2^63 to 2^63-1.(64 bits)(–9,223,372,036,854,775,808 to 9,223,372,036854,775,807 or 18,446,744,073,709,551,616 possible values)
        final double pie = 3.14;               // Constant(The value can never be changed at all).

        // Uninitialized variables(Won't print in here since local variables have to be initialized)(Instance variables (non-static fields) will have the default value)
        String uninitializedString;            // Defaults to 'null'
        int uninitializedInt;                  // Defaults to '0'
        boolean uninitializedBoolean;          // Defaults to 'false'
        double uninitializedDouble;            // Defaults to '0.0d'
        char uninitializedChar;                // Defaults to '\u0000'
        float uninitializedFloat;              // Defaults to '0.0f'
        byte uninitializedByte;                // Defaults to '0'
        short uninitializedShort;              // Defaults to '0'
        long uninitializedLong;                // Defaults to '0'

        System.out.println("The variable is: " + myString); // Replace "myString" with other variable names to see the output.

    }

}

/*

When a "static" keyword modifier is applied to a method or variable.
It means the method/variable:

• Belongs to the class and is shared by all objects of that class
• Is not unique to an object instance
• Can be accessed without instantiating the class
• A static variable is shared by all objects in a class.
• An instance variable is unique to an individual object.

*/
