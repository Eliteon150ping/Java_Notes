package ArrayAndArrayLists;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Basic Array(Data type must be stated)
        // type[] arrayName = {Values};
        String[] items = {"Shirt","Trousers","Scarf"};     // Strings
        int[] numbers = {1,2,3};                           // numbers(Can work with doubles, floats etc.)
        boolean[] booleans = {true,false,true};            //booleans

        // Declaring and Initializing an Array
        // type[] arrayName = new type[Space available(3,4 etc.)];

        int[] ages = new int[3];                          // This approach creates the array with 3 indexes but does not
                                                          // have values which has to be manually inputted.
        ages[0] = 19;                                     // The starting index of an array ALWAYS starts from 0.
        ages[1] = 42;
        ages[2] = 92;
        ages[0] = 20;                                     /* This will update the value from 19 to 20 at that index
                                                             position.                                                */

        String[] names = new String[3];
        names[0] = "Mary";
        names[1] = "Bob";
        names[2] = "Carlos";

        // The '.length' method will give the length of the array(How many values are in the array.)
        System.out.println(names.length + "\n" + ages.length);   // In this case both arrays are 3.

        /*  An enhanced for loop to print out all values of an array without the use of 'import java.util.Arrays;' and
            'Arrays.toString(arrayName)'                                                                              */

        for (int age : ages ) {                  // for (type temporaryVariable : arrayName){
            System.out.println(age);             //  System.out.println(temporaryVariable);
        }                                        // }

        /* A 'break' can be used in an Enhanced for loop to find a specific value by looping then ends which needs a
           boolean expression to work best.                                                                           */
        // What happens here is it checks if atleast one person is old enough then it'll print "true"
        boolean isAdult = false;
        for (int age : ages ) {
             if(age >= 18){
                 isAdult = true;
                 break;

             }
        }
        System.out.println("Old enough? " + isAdult);

        // ---------- 1D Array Sorting ----------
        int[] arraySorting = {5, 3, 8, 1, 2};
        System.out.println("Original array: " + Arrays.toString(arraySorting));

        Arrays.sort(arraySorting); // Sort array in ascending order
        System.out.println("Sorted array: " + Arrays.toString(arraySorting));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // Check equality
        System.out.println("Arrays equal? " + Arrays.equals(arr1, arr2)); // true

        // Fill array with a value
        int[] filled = new int[5];
        Arrays.fill(filled, 7); // Fill all positions with 7
        System.out.println("Filled array: " + Arrays.toString(filled));

        // Copy array
        int[] copy = Arrays.copyOf(arr1, 5); // Copy arr1, make length 5
        System.out.println("Copied array: " + Arrays.toString(copy));

        // NB: Other ways to create and initialze Arrays. Not so common but can appear in 1Z0-811 exam
        String[] sA1 = new String[] { "aaa"};
        String[] sA2 = new String[1] ; sA2[0] = "aaa";
        String[] sA3 = {new String( "aaa")};
        String[] sA4 = { "aaa"};

    }
}

/* NB: A data type array cannot be mixed with any other(Only strings with Strings and numbers with numbers)

*      To print out values from an array, state the name along with its index position to print that specific
       value or to see all the values in the array, import the 'import java.util.Arrays;' and type 'System.out.println
       (Arrays.toString(arrayName))'.

*      To see all values otherwise you'll see the arrays memory location instead(something like this:
       [Ljava.lang.String;@65ab7765) or just use an 'Enhanced for loop'.










*/

