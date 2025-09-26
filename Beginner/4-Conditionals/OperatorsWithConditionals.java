package Conditionals;

public class OperatorsWithConditionals {
    public static void main(String[] args) {

        // ===== Relational Operators =====
        int x = 5;
        int y = 10;

        System.out.println("x == y? " + (x == y));   // false
        System.out.println("x != y? " + (x != y));   // true
        System.out.println("x < y? " + (x < y));     // true
        System.out.println("x <= y? " + (x <= y));   // true
        System.out.println("x > y? " + (x > y));     // false
        System.out.println("x >= y? " + (x >= y));   // false

        // ===== Logical Operators =====
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));  // false
        System.out.println("a || b = " + (a || b));  // true
        System.out.println("!a = " + (!a));          // false

        // ===== Parentheses to Override Precedence =====
        int result1 = 2 + 3 * 4;           // 2 + (3*4) = 14
        int result2 = (2 + 3) * 4;         // (2+3)*4 = 20
        System.out.println("Without parentheses: " + result1);
        System.out.println("With parentheses: " + result2);

        // ===== String Equality =====
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("Using == : " + (str1 == str2));          // false → compares object references
        System.out.println("Using .equals(): " + str1.equals(str2)); // true → compares values
    }
}
