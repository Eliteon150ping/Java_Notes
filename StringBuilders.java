public class StringBuilders {

    public static void main(String[] args) {

        // This is how you create a string using the string builder class
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");                                             // The ".append()" method will concat that new word in the string


    }
}

/*

StringBuilder provides a mutable(Can be changed or modified) alternative to String.

StringBuilder:

• Is instantiated using the new keyword
• Has many methods for manipulating its value
• Provides better performance because it is mutable
• Can be created with an initial capacity


String is still needed because:

• It may be safer to use an immutable object
• A method in the API may require a string
• It has many more methods not available on StringBuilder

*/