package stringClass;

public class stringClass {

    public static void main(String[] args) {

        // Standard syntax
        String hisName = "Fred Smith";

        // The new keyword can be used to create strings,but it's not best practice:
        String herName = new String("Anne Smith");
        System.out.println(hisName + "\n" + herName);


        // Concatenating Strings(Joining Strings together)
        String myString = "Hello";
        myString = myString.concat(" World"); // Using the .concat method
        myString = myString + "!";                // Using the "+" operator
        System.out.println(myString);

        // Using the .length method to return a Primitive value
        String hello = "Hello World";
        int stringLength = hello.length();
        System.out.println("The length of \"Hello World\" is: " + stringLength);

        // The .length method can be useful to return a number and compare it to something else to get a desired output eg:
        if(stringLength == 11){ // Since "Hello World" is 11 characters(including the spaces), we get "good" since the condition is true.
            System.out.println("good");

        }else {
            System.out.println("bad");
        }

        // String Method Calls with Object Return Values Method calls returning objects:
        String greet = " HOW ".trim();                                                     // ".trim()" will remove any blank spaces ONLY before and after a word/sentence, not in between.
        String lc = greet + "DY".toLowerCase();                                            // ".toLowerCase()" will convert any upper case letters to lower case. The "toUpperCase()" will do the opposite.
                  // Or
        String lc2 = (greet + "DY").toLowerCase();

        // The ".indexOf()" method will give the INDEX position of a character starting from 0.
        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');
        System.out.println("index of first dash: "+ idx1);

        // This is if you want to find the next index postion of the same character.
        int idx2 = phoneNum.indexOf('-', idx1+1);                            // If you put any number after 1 in the 2nd argument of "idx1+1", you'll still get 7.
        System.out.println("second dash idx: "+idx2);




    }
}

/*

• A String object is immutable(its value cannot be changed).
• A String object can be used with the string concatenation operator symbol (+) or the ".concat" method for concatenation.

*/
