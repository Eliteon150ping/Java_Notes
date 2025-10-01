package ArrayAndArrayLists;

import java.util.ArrayList; // Library used for arrayList to work

public class ArrayLists {

    public static void main(String[] args) {

        // Create an ArrayList to hold numbers                               /* Data types: Integers, Strings, Boolean
        // ArrayList<type> arrayListName = new ArrayList<>()                    etc.                                  */
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding numbers to the list                                        // 'add()' to add values to the arrayList
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);

        // Displaying all numbers                                           // Use Enhanced for loop to display values
        System.out.println("All numbers:");
        for (int number :numbers) {
            System.out.println(number);
        }

        // Accessing a specific number by index                            // 'get()' to display a value by its index
        System.out.println("number at index 1: " +numbers.get(1));         // position

        // Updating a number                                               // 'set()' to update a value at that index
        numbers.set(1, 4);                                                 // position.
                                                                           // example. '.set(1,3)' At index position '1'
                                                                           // , replace the current value with '3'.
       System.out.println("Updated number at index 1: " +numbers.get(1));

        // Removing a number
        numbers.remove(0);                                           // '.remove()' to delete a number at that
        System.out.println("number after removal:");                       // index position
        for (int number :numbers) {
            System.out.println(number);
        }

        // Checking the size of the ArrayList                              // '.size()' will display the length of the
        System.out.println("Total numbers: " +numbers.size());             // arrayList(How many numbers are in the
                                                                           // arrayList in total)
        // ---------- ArrayList contains() and indexOf() ----------
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\nFruits list: " + fruits);

        // Check if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana")); // true

        // Find index of an element
        int orangeIndex = fruits.indexOf("Orange");
        System.out.println("Index of Orange: " + orangeIndex);

        // Removing by element
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);
    }
}

/* NB: ArrayList is more flexible and feature-rich, making it more useful in scenarios where dynamic resizing is needed,
       whereas Array is faster and ideal for simple, fixed-size collections.                                          */

// Table showing the differences the between an array and arrayList
/*


| Feature               | Array                                 | ArrayList                                                                     |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Size**              | Fixed size; declared at creation      | Dynamic size; grows or shrinks as needed                                      |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Type**              | Can hold both primitives and objects  | Holds only objects (uses wrapper classes for primitives)                      |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Syntax**            | int[] arr = new int[10];              | ArrayList<Integer> list = new ArrayList<>();                                  |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Memory Management** | Allocated memory is fixed             | Automatically adjusts memory as elements are added or removed                 |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Performance**       | Faster for fixed-size data            | Slightly slower due to resizing and boxing/unboxing of primitives             |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Element Access**    | array[index]                          | list.get(index)                                                               |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Adding Elements**   | Cannot change size after creation     | Use add() to add elements                                                     |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Removing Elements** | Requires shifting elements manually   | Use remove(index) to remove elements                                          |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Multi-dimensional** | Supports multi-dimensional arrays     | Only single-dimensional lists (nested ArrayLists can mimic multi-dimensional) |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Initialization**    | Can be initialized with {} syntax     | Must use add() for initialization                                             |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Methods**           | Limited to basic operations(eg.length)| Provides methods like add(), remove(), set(), contains()                      |
|-----------------------|---------------------------------------|---------------------------------------------------------                      |
| **Usage**             | Preferred for fixed-size, simple data | Preferred for flexible-size data collections                                  |






*/
