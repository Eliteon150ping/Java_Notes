package NumbersAndOperators;

public class numbersAndOperators {

    //NB: Never forget BODMAS:
    //    1) Brackets
    //    2) Order of powers(exponents) or roots
    //    3) Division
    //    4) Multiplication
    //    5) Addition
    //    6) Subtraction

    public static void main(String[] args) {
        // Math Operators

        // |Addition         | + |
        // |Subtraction      | - |
        // |Multiplication   | * |
        // |Division         | / |
        // |Modulus          | % | --> finds the remainder value of dividing example. 3 % 2 will give 1

        // Increment and Decrement Operators (++ and --) Adds or subtracts 1

        // Post in/decrement(Will only add/subtract after the execution. Needs to be printed a second time for the new
        // value to show)
        int num = 1;
        System.out.println("The post increment of 1 is "+ num++);
        System.out.println("The post increment being printed a second time is " + num);

        int num2 = 2;
        System.out.println("The post decrement of 2 is " + num2--);
        System.out.println("The post decrement being printed a second time is " + num2);

        System.out.println("////////////////////////////////////////////////////");

        // Pre in/decrement(Will only add/subtract before the execution)
        int num3 = 3;
        System.out.println("The pre increment of 3 is "+ ++num3);

        int num4 = 4;
        System.out.println("The pre decrement of 4 is " + --num4);


    }
}


/*

Combining Operators to Make Assignments(This is a shortcut for eg: a = a + b; which is a += b;)

eg: int a = 6,
        b = 2;

Purpose                 | Operator | Example  | Result
------------------------------------------------------
Add to and assign       | +=       | a += b   | a = 8
Subtract from and assign| -=       | a -= b   | a = 4
Multiply by and assign  | *=       | a *= b   | a = 12
Divide by and assign    | /=       | a /= b   | a = 3
Get remainder and assign| %=       | a %= b   | a = 0


*/