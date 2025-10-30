package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
        public static void main(String[] args) {

            /* Exception = An event that interrupts the normal flow of a program
                           (Dividing by zero, file not found, mismatch input type)
                           Surround any dangerous code with a try{} block
                           try{}, catch{}, finally{}.                                                                 */



            try (Scanner scanner = new Scanner(System.in)) {             // The "Try" block is used when you want a user
                                                                         // to enter an expected value like a number
                System.out.print("Enter a number: ");                    // but if they enter anything else like a
                                                                         // string etc. The following catch blocks will
                int number = scanner.nextInt();                          // display a error message for the user.

                System.out.println(number);
            }
            catch (InputMismatchException e) {                           // This is used for a string.
                System.out.println("That wasn't a number!");
            }
            catch (ArithmeticException e) {                              // This is used for any math errors.
                System.out.println("YOU CAN'T DIVIDE BY ZERO!");
            }
            catch (Exception e) {                                        /* This is used for any error you would'nt
                                                                            expect(Like a last resort.)               */
                // SAFETY NET
                System.out.println("Something went wrong");
            }
            finally {                                                    // This is optional but it's good for
                                                                         // displaying a message regardless of an error
                System.out.println("This always executes");              // or not eg. If a calculation was successful
            }                                                            // or not, a message like, "Operation
        }                                                                // completed" will show for conclusion.

}

// Throwing your own exception
class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");         // create & throw
        }
        System.out.println("Access granted – you’re old enough!");
    }

    public static void main(String[] args) {
        checkAge(15);                                                             // will throw IllegalArgumentException
    }
}

// Custom exception (checked)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class CustomExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Custom: Age must be at least 18");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Custom unchecked exception
class TooLowBalanceException extends RuntimeException {
    public TooLowBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            // Throw unchecked exception
            throw new TooLowBalanceException("Withdrawal of " + amount +
                    " exceeds current balance " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        acc.withdraw(50);                                       // OK
        acc.withdraw(200);                                      // Will throw TooLowBalanceException (unchecked)
    }
    /*

    Why it’s “UNCHECKED”:
    Because TooLowBalanceException extends RuntimeException.
    You’re NOT forced to use TRY…CATCH or THROWS when calling withdraw — you can, but Java won’t require it.
    If you CHANGED it to extends EXCEPTION instead, it would become a checked exception, and then the compiler would
    force you to either catch it or declare throws in the calling method.

    */
}

/*

Runtime vs. Compile errors:
+---------------------+--------------------------------------+--------------------------------------+
| Error Type          | When It Happens                      | Example                              |
+---------------------+--------------------------------------+--------------------------------------|
| Compile-time error  | Compile errors happen when the syntax| Missing semicolon, undeclared        |
|                     | in your code are not defined         | variable, wrong variable name        |
|                     | correctly , misspelled or incomplete |                                      |
|                     | (The program willnever fully execute/|                                      |
|                     | run.)                                |                                      |
+---------------------+--------------------------------------+--------------------------------------|
| Runtime error       | Runtime errors happen when the       | Divide by zero, invalid array index, |
| (Exception)         | program is running but an unexpected | invalid user input                   |
|                     | error or logical issue occurs        |                                      |
+---------------------+--------------------------------------+--------------------------------------+



Checked vs. Unchecked exceptions:
+---------------+------------------------------------+---------------------------------------------+
| Aspect        | Checked Exceptions                 | Unchecked Exceptions                        |
+---------------+------------------------------------+---------------------------------------------+
| When enforced?| Compile time                       | Runtime                                     |
+---------------+------------------------------------+---------------------------------------------+
| Must handle?  | Yes (catch or declare with throws) | No (optional)                               |
+---------------+------------------------------------+---------------------------------------------+
| Typical base  | Exception (non-Runtime)            | RuntimeException / Error                    |
+---------------+------------------------------------+---------------------------------------------+
| Examples      | IOException, SQLException          | NullPointerException, ArithmeticException   |
+---------------+------------------------------------+---------------------------------------------+

Examples of Runtime/Unchecked exception types here:

1) Most common:
+-------------------------------+----------------------------------------+
| Exception                     | Meaning                                |
+-------------------------------+----------------------------------------+
| NullPointerException          | Using an object that hasn’t been       |
|                               | instantiated.                          |
+-------------------------------+----------------------------------------+
| ArrayIndexOutOfBoundsException| Accessing an invalid index in an array.|
+-------------------------------+----------------------------------------+
| ArithmeticException           | Illegal math operation (e.g. divide by |
|                               | zero).                                 |
+-------------------------------+----------------------------------------+
| NumberFormatException         | Converting a non-numeric string into a |
|                               | number.                                |
+-------------------------------+----------------------------------------+
| ClassCastException            | Invalid type casting between objects.  |
+-------------------------------+----------------------------------------+
| IllegalArgumentException      | Passing an invalid or inappropriate    |
|                               | argument to a method.                  |
+-------------------------------+----------------------------------------+
| IllegalStateException         | Method called at the wrong time for    |
|                               | the object’s state.                    |
+-------------------------------+----------------------------------------+
| StackOverflowError            | Infinite recursion or too many nested  |
|                               | method calls.                          |
+-------------------------------+----------------------------------------+
| OutOfMemoryError              | JVM ran out of memory allocating       |
|                               | objects.                               |
+-------------------------------+----------------------------------------+
| InputMismatchException        | Wrong input type (e.g. text when a     |
|                               | number is expected).                   |
+-------------------------------+----------------------------------------+
| Exception (generic)           | A general error message to display     |
|                               | for any unexpected error.              |
+------------------------------------------------------------------------+


2) Least common:
+--------------------------------+----------------------------------------+
| NoSuchElementException         | Requested element doesn’t exist in a   |
|                                | collection.                            |
+--------------------------------+----------------------------------------+
| UnsupportedOperationException  | Operation not supported by collection. |
+--------------------------------+----------------------------------------+
| SecurityException              | Security manager blocks an action.     |
+--------------------------------+----------------------------------------+
| ConcurrentModificationException| Modified a collection during iteration.|
+--------------------------------+----------------------------------------+


Examples of Checked Exceptions types here:
+------------------------------+-------------------------------------------------------------------+
| Exception Name               | Meaning / When It Happens                                         |
| -----------------------------+-------------------------------------------------------------------|
| IOException                  | General I/O error (e.g., reading or writing a file).              |
+------------------------------+-------------------------------------------------------------------+
| FileNotFoundException        | Trying to open a file that doesn’t exist. (Subclass of IOException)|
+------------------------------+-------------------------------------------------------------------+
| SQLException                 | Database access error (invalid query or unreachable database).    |
+------------------------------+-------------------------------------------------------------------+
| ClassNotFoundException       | JVM can’t find a class by name at runtime (used in reflection).   |
+------------------------------+-------------------------------------------------------------------+
| InterruptedException         | A thread was interrupted while sleeping or waiting.               |
+------------------------------+-------------------------------------------------------------------+
| CloneNotSupportedException   | Calling clone() on an object that doesn’t implement Cloneable.    |
+------------------------------+-------------------------------------------------------------------+
| ParseException               | Error parsing data (invalid date or number format).               |
+------------------------------+-------------------------------------------------------------------+
| InstantiationException       | Attempt to instantiate an abstract class or interface.            |
+------------------------------+-------------------------------------------------------------------+
| NoSuchMethodException        | Method with the requested signature doesn’t exist.                |
+------------------------------+-------------------------------------------------------------------+
| URISyntaxException           | Invalid or badly formatted URI string.                            |
+------------------------------+-------------------------------------------------------------------+



*/
