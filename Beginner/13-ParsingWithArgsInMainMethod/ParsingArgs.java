package Beginner;

public class ParsingArgs {

    public static void main(String[] args) {

        // When you complie and run the app in cmd or a similar terminal, you can pass arguements into it through cmd etc. simply because of the "args" keyword from the main method
        System.out.println("args[0] is "+ args[0]);
        System.out.println("args[1] is "+ args[1]);

        // Converting from a string to an integer
        System.out.println("The total is " + args[2] + args[3] + " as a string concat.");
        int arg2 = Integer.parseInt(args[2]); // Integer.parseInt() will convert a value from a string to an integer
        int arg3 = Integer.parseInt(args[3]);

        System.out.println("Total is: " + (arg2+arg3) + " after the arguements have been converted to integers.");
    }
}

/*

NB: When running the app in cmd, type this: 'javac ParsingArgs.java' to complie
    then 'java ParsingArgs.java hello  world     6        9'  into the terminal then press enter to see the results
                                arg[0] arg[1]  arg[2] arg[3]
    -Each space inbetween the values after java indicates a differnt arguement.
*/