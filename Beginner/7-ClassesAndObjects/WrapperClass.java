package ClassesAndObjects;

public class WrapperClass {
    public static void main(String[] args) {

        /* Wrapper classes = Allow primitive values (int, char, double, boolean)
                             to be used as objects. "Wrap them in an object"
                             Generally, don't wrap primitives unless you need an object.
                             Allows use of Collections Framework and static utility methods.                          */


        // How to create a wrapper class(old way)
        // Integer a = new Integer(123);                      NB: This is the old but the best way to visualise it since
        // Double b = new Double(3.14);                           it looks like the standard way to define a object.
        // Character c = new Charcter('$');
        // Boolean d = new Boolean(true);

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing(Taking a wrapped object and converting it back into its data type)
        int a1 = a;
        double b1 = b;
        char c1 = c;
        boolean d1 = d;

        // Some useful methods for these wrapper classes:

        // 1) '.toString()' Method
        // Allows any primitive data type to be converted to a String.
        String a2 = Integer.toString(123);
        String b2 = Double.toString(3.14);
        String c2 = Character.toString('$');
        String d2 = Boolean.toString(true);

        String x = a2 + b2 + c2 + d2;                                           // Here we're able to convert all of
        System.out.println(x);                                                  // the data types into a String which
                                                                                // can be concated into one big String.

        // 2) Converting a String into a primitive data type.
        // '.Parse...' Method()
        int a3 = Integer.parseInt("123");
        double b3 = Double.parseDouble("3.14");
        char c3 = ("Pizza").charAt(0);                                         // .charAt() is used for accessing a
                                                                               // index position of a String and
                                                                               // converting that character into a Char.
        boolean d3 = Boolean.parseBoolean("true");


        // 3) Checking types
        // Returns true or false, good for validating user input
        char letter = 'a';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        // 4) '.valueOf()' method
        // Converts a String into a Wrapper Object instead of a Primitive.
        Integer intObj = Integer.valueOf("123");                                          // creates Integer object
        Double doubleObj = Double.valueOf(6.28);                                          // 6.28 -> Double object
        Boolean boolObj = Boolean.valueOf("true");                                        // "true" -> Boolean object

        /* 5) ...Value() -> converts wrapper object back to primitive
        (alternative way)                                                                                          */
        int numVal = intObj.intValue();                                                     // Integer -> int
        double dblVal = doubleObj.doubleValue();                                            // Double -> double
        boolean boolVal = boolObj.booleanValue();                                           // Boolean -> boolean

        // 6) Wrapper constants
        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);




    }
}
/*

===========================
 WRAPPER CLASS EXAM NOTES
===========================

✔ Wrapper classes allow primitives to be treated as objects
✔ Autoboxing and Unboxing
✔ toString() -> primitive to String
✔ parseXxx() -> String to primitive
✔ valueOf() -> String/primitive to wrapper OBJECT
✔ xxxValue() -> wrapper OBJECT to primitive
✔ Useful constants: MAX_VALUE, MIN_VALUE
✔ Useful Character class methods (isLetter, isUpperCase, isDigit, etc.)

----------------------------------------------------
 PRIMITIVE TYPES & THEIR RANGES (Wrapper constants)
----------------------------------------------------
| Primitive | Wrapper   | Bits | Min Value                          | Max Value                                 |
|-----------|-----------|------|------------------------------------|-------------------------------------------|
| byte      | Byte      | 8    | -128 (Byte.MIN_VALUE)              | 127 (Byte.MAX_VALUE)                      |
| short     | Short     | 16   | -32,768 (Short.MIN_VALUE)          | 32,767 (Short.MAX_VALUE)                  |
| int       | Integer   | 32   | -2,147,483,648 (Integer.MIN_VALUE) | 2,147,483,647 (Integer.MAX_VALUE)         |
| long      | Long      | 64   | -9,223,372,036,854,775,808         | 9,223,372,036,854,775,807                 |
| float     | Float     | 32   | 1.4E-45 (Float.MIN_VALUE)*         | 3.4028235E38 (Float.MAX_VALUE)            |
| double    | Double    | 64   | 4.9E-324 (Double.MIN_VALUE)*       | 1.7976931348623157E308 (Double.MAX_VALUE) |
| char      | Character | 16   | '\u0000' (0)                       | '\uffff' (65,535)                         |
| boolean   | Boolean   | 1    | false                              | true                                      |

* Float.MIN_VALUE and Double.MIN_VALUE represent the smallest POSITIVE nonzero value.
  For negative extremes, use -Float.MAX_VALUE and -Double.MAX_VALUE.

*/