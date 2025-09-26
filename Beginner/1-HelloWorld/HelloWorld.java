package HelloWorld;

             // Case-sensitive(Use Pascal-Case for naming with more than 1 word for a class and Camel-case for Variables/methods.)
public class HelloWorld {

    public static void main(String[] args) { // Start of every Java program(AKA the Main method).

        System.out.println("Hello World"); // Print to the console.
    }
}

/*

To run in cmd:

1) Open the directory where the file is saved in cmd(Copy and paste the location eg. C:\to\your\directory).
2) javac HelloWorld.java (Called compiling).      // Compiles to HelloWorld.class
3) Again type java HelloWorld.java to see the output.  // Runs the compiled bytecode using JVM

What is Java?
Java is a general-purpose, object-oriented programming language designed to be platform-independent.

1) What is Compiling?
Compiling Java code is essential because the machine(Your PC) cannot understand a human-readable language like Java.
By translating human-readable code into machine-readable language, the Java compiler ensures that the code runs and produces
the expected output(Compiler creates bytecode from human code).

2) What is JVM?
While compiling, the JVM(Java Virtual Machine) is basicaly a virtual computer runtime engine that runs compiled machine code
(bytecode) on any operating system eg. Windows or MacOS. It acts as a universal software computer to run bytecode for any OS.

3) What is Bytecode?
Bytecode is the result of the human written code being coverted to machine code and is stored in the form of a ".class" file
which can then can be transfered to a different OS to be ran by that OS with zero issues. It is platform independent meaning
it will run on ANY Operating System.


*/


