package PromotingAndCasting;

import java.lang.reflect.Type;

public class PromotingAndCastingVariables {
    // Change values to different primitive value types

    public static void main(String[] args) {

        // Widening Promotion(Converting to a bigger type)
        int intToLong = 6;
        long longValue = intToLong;
        System.out.println(longValue);                                         // Becomes '6L'

        // Narrowing Type Casting(Converting to a smaller type)
        // Converting a double to an int
        int doubleToInt = (int)20.69;
        System.out.println(doubleToInt);                                      // 20.69 will become a integer of 20

        double d = 9.78;
        int i = (int) d; // loses decimal

        // Be careful when converting as this could cause issues...
        // Narrowing with possible overflow
        long largeLong = 123987654321L;
        int longToInt = (int) largeLong;                                     // overflow - unpredictable value
        System.out.println(longToInt);                                       // -566397263

        // A safe way to convert
        int myInt2;
        long myLong2 = 99L;
        myInt2 = (int) (myLong2);                                            /* No data loss because 99 fits within int’s
                                                                                range, myInt is 99                    */

        // Narrowing safely (no data loss)
        long smallLong = 99L;
        int safeInt = (int) smallLong;                                       // no change since within int range
        System.out.println(safeInt);                                         // 99

        // Promotion in expressions
        int x = 5;
        double y = x;                                                        // promotion int → double
        System.out.println(y);                                               // 5.0

        // Char Casting and Unicode
        char c1 = 65;                                                        // 'A'
        char c2 = '\u0041';                                                  /* Unicode for 'A'(Search online for the
                                                                                complete table)                       */
        int numFromChar = c1;                                                // 65 (ASCII/Unicode value)
        System.out.println(numFromChar);

        // Mixed-Type Arithmetic Promotion
        int numVal = 5;
        double doubleVal = 6.2;
        double result = numVal + doubleVal;                                  // int promoted to double
        System.out.println(result);

        byte b1 = 1;
        byte b2 = 2;
        int sum = b1 + b2;                                                   /* result is int, must cast back to byte if
                                                                                needed                                */
        byte sumBackToByte = (byte) sum;
        System.out.println(sumBackToByte);

    }
}

/*

Promotion(Widening):

• Automatic promotions:
– When you assign a smaller type to a larger type:
  From byte -> short -> char -> int -> long -> float → double
- char also promotes to int

Type Casting(Narrowing):

• When to cast:
– If you assign a larger type to a smaller type:
  From double → float -> long -> int -> char -> short -> byte
- Risk: overflow or precision loss


NB: Be careful when converting as values can be lost in the conversion.

*/