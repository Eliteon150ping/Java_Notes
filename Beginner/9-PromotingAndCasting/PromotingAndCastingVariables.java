package PromotingAndCastingVariables;

public class PromotingAndCastingVariables {
    // change values to different primitive value types

    public static void main(String[] args) {

        // Converting a double to an int
        int DoubleToInt = (int)20.69;
        System.out.println(DoubleToInt); // 20.69 will become a integer of 20

        // Promotion(Converting to a bigger type)
        long intToLong = 6;

        // Type Casting(Converting to a smaller type)
        int longToInt = (int)20L;



        // Be careful when converting:
        // This could cause issues...
        int myInt;
        long myLong = 123987654321L;
        myInt = (int) (myLong); // Number is chopped.
                                // myInt is -566397263

        // A safe way to convert
        int myInt2;
        long myLong2 = 99L;
        myInt2 = (int) (myLong2); // No data loss, only zeroes.
                                  // myInt is 99

    }
}

/*

Promotion:

• Automatic promotions:
– If you assign a smaller type to a larger type:
  From byte -> short -> int -> long


Type Casting:

• When to cast:
– If you assign a larger type to a smaller type:
  From long -> int -> short -> byte

NB: Be careful when converting as values can be lost in the conversion.

*/