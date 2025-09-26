package StringAndStringBuilder;

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

        //More Comparison
        String a = "Test";
        String b = "Test";
        System.out.println(a == b); // compares references
        System.out.println(a.equals(b)); // compares values
        System.out.println(a.equalsIgnoreCase("test")); // ignores case

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

        // Substring
        String combined = "Hello" + "World";
        String sub = combined.substring(0, 5); // "Hello"
        System.out.println(sub);

        // Character access
        char letter = combined.charAt(1); // 'e'
        System.out.println(letter);

        // Replace
        String replaced = combined.replace("World", "Java");
        System.out.println(replaced); // "World" gets replaced by "Java"

        // Escape sequences
        String escaped = "She said \"Hello\"\nNew line\tTabbed";
        System.out.println(escaped);

        // Mixing Strings and Other Types
        String mix = "Number: " + 5; // "Number: 5"
        String calc = "Sum: " + (2 + 3); // "Sum: 5"
        System.out.println(mix + " " + calc);

    }
}

/*

• A String object is immutable(its value cannot be changed).
• A String object can be used with the string concatenation operator symbol (+) or the ".concat" method for concatenation.

*/
