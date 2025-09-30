    package Loops;

    public class loops {

        public static void main(String[] args) {

            // Basic Loops

            // For Loop(Executes a block of code a specified number of times.)
            // for(Initialization; condition; update){code to execute...}
            for (int i = 1; i < 10; i++) {                                          // Here 'i' is set to 1 then 'i' is
                                                                                    // less than finally increase 'i' by
                                                                                    // 1 until 'i' is no longer less
                                                                                    // than 10
                System.out.println("This is iteration number: " + i);           // This block of code will execute over
                                                                                // and over until 'i' is no longer less
                                                                                // than 10.

            }

            // while loop(Repeats the code while a condition is true. Useful when the number of iterations is not known
            // in advance.)
            // while(condition){code to execute... i++;}
            int i = 1;
            while (i < 10) {                                                    // Putting 'true' as the condition will
                System.out.println("This is while loop");                       // cause an infinite loop
                i++;                                                      //NB: Do NOT forget to update with 'i++'/'i--'
            }                                                             //   otherwise you'll go into an infinite loop

            // Do while loop(Executes the code block at least once before checking the condition)
            // do{Code to execute...} while (condition);
            int a = 1;
            do {
                System.out.println("Iteration: " + a);
                a++;
            } while (a < 1);                                                   // Even though 'a' is NOT less than 1, it
                                                                               // still executed the 'do' block once
            // Enhanced for Loop (For-Each Loop)(Best used for arrays)         // before checking the condition
            // for (type element : arrayOrCollection) {Code to execute}
            int[] numbers = {10, 20, 30, 40, 50};
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

            // Advanced loops

            // Nested Loops
            // Loops inside another loop. Useful for multi-dimensional data and making tables.

            for (int b = 1; b <= 3; b++) {      // Outer loop
                for (int j = 1; j <= 3; j++) {  // Inner loop runs fully for every single iteration of the outer loop.
                    System.out.println("b: " + b + ", j: " + j);
                }
            }

            // Loop Control Statements
            // With 'Break': Exits the loop prematurely.
            for (int c = 1; c <= 5; c++) {
                if (c == 3) {                                                       // Loop ends at '3'.
                    break;
                }
                System.out.println("Iteration: " + c);
            }

            // With Continue: Skips the current iteration and moves to the next.
            for (int d = 1; d <= 5; d++) {
                if (d == 3) {                                                     // Loop prints everything until 2 then
                    continue;                                                     // skips 3 and continues printing till
                }                                                                 // 5
                System.out.println("Iteration: " + d);
            }


        }
    }

    /* More on nested loops:
     *  1) The inner loop will do a full run PER outer loop iteration
     *     eg. IF an outer loop has 4 iterations and the inner loop has 3 iterations
     *         the inner loop will do a full run of 3 times when the outer loop is on its 1st iteration
     *         then when the outer loop is on its 2nd iteration, the inner loop will do another full run of 3 iterations
     *         until the outer loop ends its condition on false */

    // Use nested loops when dealing with patterns, grids/tables, or any multi-level repetitive task!

    /*

    Comparing Loop Constructs:

    • Use the while loop to iterate indefinitely through
    statements and to perform the statements zero or more
    times.

    • Use the standard for loop to step through statements a
    predefined number of times.

    • Use the enhanced for loop to iterate through the
    elements of an Array or ArrayList.

    • Use the do/while loop to iterate indefinitely through
    statements and to perform the statements one or more
    times.

    */