package Beginner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
        public static void main(String[] args) {

            // Exception = An event that interrupts the normal flow of a program
            //                      (Dividing by zero, file not found, mismatch input type)
            //                      Surround any dangerous code with a try{} block
            //                      try{}, catch{}, finally{}



            try (Scanner scanner = new Scanner(System.in)) {   // The "Try" block is used when you want a user to enter an
                System.out.print("Enter a number: ");          // expected value like a number but if they enter anything else
                int number = scanner.nextInt();                // like a string etc. The following catch blocks will display
                System.out.println(number);                    // a error message for the user.
            }
            catch (InputMismatchException e) {                 // This is used for a string
                System.out.println("That wasn't a number!");
            }
            catch (ArithmeticException e) {                     // This is used for any math errors
                System.out.println("YOU CAN'T DIVIDE BY ZERO!");
            }
            catch (Exception e) {                               // This is used for any error you would'nt expect(Like a last
                // SAFETY NET                                   //  resort.)
                System.out.println("Something went wrong");
            }
            finally {                                          // This is optional but it's good for displaying a message
                System.out.println("This always executes");    // regardless of an error or not eg. If a calculation was
            }                                                  // successful or not, a message like, "Operation completed"
        }                                                      // will show for conclusion

}

/*

Runtime vs. compile errors:

1) Compile errors happen when the syntax in your code are not defined correctly, misspelled or incomplete(The program will
   never fully execute/run.)

2) Runtime errors happen when the program is running but an unexpected error or logical issue occurs

////////////////////////////////////////
Examples of Runtime exception types here:

Most common:

1) NullPointerException: Attempt to use an object reference that has not been instantiated.

2) ArrayIndexOutOfBoundsException: Thrown to indicate that an array has been accessed with an illegal index.

3) ArithmeticException: Mainly when a user divides by zero or some form of impossible or undefined mathematical result occurs

4) NumberFormatException: This occurs when an attempt is made to convert a String to a numeric type
                          (e.g., int, double) but the String does not contain a valid numeric format.

5) ClassCastException: Thrown when an attempt is made to cast an object to a type to which it is not an instance.

6) IllegalArgumentException: Thrown to indicate that a method has been passed an illegal or inappropriate argument.

7) IllegalStateException: Thrown to indicate that a method has been invoked at an illegal or inappropriate time,
                          usually because the object's state is not valid for that operation.

8) StackOverflowError: This error occurs when the call stack overflows, typically due to excessive method calls,
                       often in the case of uncontrolled recursion.

9) OutOfMemoryError: This error indicates that the Java Virtual Machine (JVM) has run out of memory to allocate new objects.
                     This can be caused by memory leaks or by attempting to allocate a very large amount of memory.

10) InputMismatchException: When a user types anything but a numeric value or a value that cannot be parsed into a numeric value

11) Exception: A general error message to display for any unexpected error

Least common:

1) NoSuchElementException: Thrown by methods in java.util classes to indicate that the element being requested does not exist.

2) UnsupportedOperationException: Thrown to indicate that the requested operation is not supported.

3) SecurityException: Thrown by the security manager to indicate a security violation.

4) ConcurrentModificationException: Thrown when an object is concurrently modified while iterating over it.

*/
