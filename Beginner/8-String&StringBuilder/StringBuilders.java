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

        // Garbage Collection
        // Object creation
        StringBuilder sb1 = new StringBuilder("Hello");

        // Reassignment (dereferencing the original object)
        sb1 = new StringBuilder("Goodbye");

        // At this point, the original "Hello" StringBuilder object
        // is no longer referenced by any variable → eligible for GC.

        // Nulling out a reference
        StringBuilder sb2 = new StringBuilder("Java");
        sb2 = null; // "Java" StringBuilder now eligible for GC

        // Forcing garbage collection (not guaranteed, JVM decides!)
        System.gc(); // Suggests the JVM run garbage collection

        System.out.println("Program finished.");


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

Garbage Collection:

✔ Object Creation:
   - Objects are created with `new`
   - Example: `StringBuilder sb = new StringBuilder("Hello");`

✔ Dereferencing:
   - Reassigning or nulling a reference removes the link to the object
   - Example: `sb = null;` or `sb = new StringBuilder("Other");`

✔ Garbage Collection (GC):
   - When no live references point to an object, it becomes eligible for GC
   - JVM automatically reclaims memory
   - You can suggest GC with `System.gc()`, but execution is NOT guaranteed

✔ Key Exam Points:
   - "Eligible for GC" means there are no active references
   - GC is automatic; programmer cannot force it, only request it
   - Local variables go out of scope after a method ends → eligible for GC if no references remain

*/