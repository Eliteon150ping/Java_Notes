package Conditionals;

public class ifElseStatement {

    public static void main(String[] args) {

        // If Statement
        boolean n = true;

        // This will only execute if true but if it's false, nothing will happen
        if (n){
            System.out.println("true");
        };

        // Simple if else statement
        boolean a = true;
        boolean b = false;

        // If true do this...
        if (b){

            System.out.println("a is true");

        // ...or this if false
        } else {

            System.out.println("b is false");
        }
//////////////////////////////////////////////////////////
        // Chained if else statement
        int age = 19;

        // Do this if age less then 18
        if (age < 18){

            System.out.println("Too young");

        // Do this if age between 18 and 65
        } else if(age > 18 && age < 65 ) {

            System.out.println("Normal");

        // Do this if not of the above is true(is false here)
        } else {
            System.out.println("Too old");
        }

        // An alternative to an if else statement is a ternary operator
        int age2 = 18;
        String result = (age2 >= 18) ? "Adult" : "Child";   /* Must declare data return type example. Boolean, int, String
        System.out.println(result);                            etc. The "?" tells true and ":" tells false            */


    }
}

/*___________________________________________________________
 | Is equal to                 |  ==  |   int i=1; (i == 1)  |
 | Is not equal to             |  !=  |   int i=2; (i != 1)  |
 | Is less than                |  <   |   int i=0; (i < 1)   |
 | Is less than or equal to    |  <=  |   int i=1; (i <= 1)  |
 | Is greater than             |  >   |   int i=2; (i > 1)   |
 | Is greater than or equal to |  >=  |   int i=1; (i >= 1)  |  */

// Boolean Expressions will check if one is true or not(can chain multiple checks to execute)
// Best used for comparison.