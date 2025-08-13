package StringBuilders;

public class StringBuilders {

    public static void main(String[] args) {

        // This is how you create a string using the string builder class
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");                     // The ".append()" method will concat that new word in the string
        mySB.insert(5, ",");             // "Hello, World"
        mySB.delete(5, 6);                        // "Hello World"
        mySB.replace(6, 11,"Java"); // "Hello Java"
        mySB.reverse();                          // "avaJ olleH"
        mySB.setCharAt(0, 'h');         // "havaJ olleH"

        // Length vs Capacity
        System.out.println(mySB.length());   // number of characters
        System.out.println(mySB.capacity()); // storage space available

        // Convert to String
        String finalStr = mySB.toString();
        System.out.println(finalStr);


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