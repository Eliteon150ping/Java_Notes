package Variables;

public class Variables {
    // Also Data types(primitive)

    public static void main(String[] args) {

        // Basic variables
        String myString = "This is a string";  // Contains a series of characters

        int myInt = 3;                         /* Holds a value from -2^31 to 2^31-1.(32 bits)
                                                  (–2,147,483,648 to 2,147,483,647, or 4,294,967,296 possible values) */

        boolean myBoolean = true;              // Either True or False

        // Advanced variables
        double myDouble = 3.14;                // Holds a decimal number

        char myChar = 'A';                     /* Contains a single character with (''). NB: The ascii table displays each
                                                  char character's value.(a-z:97-122, A-Z:65-90)                      */

        float myFloat = 3.14f;                 /* Contains a decimal number with 'f' at the end.(32 bits)
                                                  (1.40239846e-45f to 3.40282347e+38f)                                */

        byte myByte = 127;                     /* Holds a value from -2^7 to 2^7-1.(8 bits)
                                                  (–128 to 127, or 256 possible values)                               */

        short myShort = 1234;                  /* Holds a value from -2^15 to 2^15-1.(16 bits)
                                                  (–32,768 to 32,767, or 65,535 possible values)                      */

        long myLong = 1234567890L;             /* Holds a value from -2^63 to 2^63-1.(64 bits)
                                                  (–9,223,372,036,854,775,808 to 9,223,372,036854,775,807 or
                                                  18,446,744,073,709,551,616 possible values)                         */

        final double pie = 3.14;               // Constant(The value can never be changed at all).

        /* Uninitialized variables(Won't print in here since local variables have to be initialized)(Instance variables
           (non-static fields) will have the default value)                                                           */

        String uninitializedString;            // Defaults to 'null'
        int uninitializedInt;                  // Defaults to '0'
        boolean uninitializedBoolean;          // Defaults to 'false'
        double uninitializedDouble;            // Defaults to '0.0d'
        char uninitializedChar;                // Defaults to '\u0000'
        float uninitializedFloat;              // Defaults to '0.0f'
        byte uninitializedByte;                // Defaults to '0'
        short uninitializedShort;              // Defaults to '0'
        long uninitializedLong;                // Defaults to '0'

        // Primitive Literals
        int binary = 0b1010;                   // binary 10
        int hex = 0x1F;                        // hexadecimal 31
        int octal = 017;                       // octal 15
        double sci = 1.23e2;                   // scientific notation 123.0

        // Underscores in numeric literals
        int million = 1_000_000;               // easier to read


        System.out.println("The variable is: " + myString); /* Replace "myString" with other variable names to see the
                                                               output.                                                */

    }

}
/*

1) Local Variables:

✅Declaration:
• Declared within a method, constructor, or a block of code.

✅Scope:
• Accessible only within the method, constructor, or block where they are declared.
• They are not visible or usable outside of that specific scope.

✅Lifetime:
• Created when the method, constructor, or block is entered and destroyed when the execution of that block finishes.
• They exist only during the execution of their containing scope.

✅Initialization:
• Must be explicitly initialized before use. The compiler will issue an error if an uninitialized local variable is
  accessed.

✅Memory:
• Stored on the stack.

2) Instance Variables:

✅Declaration:
• Declared inside a class but outside any method, constructor, or block.

✅Scope:
• Accessible by all methods within the class. Their accessibility to code outside the class depends on their access
  modifiers (e.g., public, private, protected).

✅Lifetime:
• Created when an object (instance) of the class is created and destroyed when the object is garbage collected.Each object
  has its own copy of instance variables.

✅Initialization:
• Automatically initialized to default values if not explicitly assigned (e.g., 0 for numeric types, false for boolean,
  null for reference types).

✅Memory:
• Stored on the heap as part of the object.

3) Static Variables (Class Variables):

✅Declaration:
• Declared inside a class but outside any method, constructor, or block, using the static keyword.

✅Scope:
• Accessible by all instances of the class and can be accessed directly using the class name.

✅Lifetime:
• Created when the class is loaded into memory and destroyed when the program terminates. There is only one copy of a
  static variable, shared across all instances of the class.

✅Memory Allocation:
• Stored in the method area (part of the heap memory).

✅Initialization:
• If not explicitly initialized, they receive default values based on their data type.


*/
