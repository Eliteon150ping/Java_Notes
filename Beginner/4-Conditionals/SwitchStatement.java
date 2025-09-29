package Conditionals;

public class SwitchStatement {

    public static void main(String[] args) {

        int month = 2;
        boolean isLeapYear = true;

        // A Switch Statement is a simplier more performance way of doing an if else statement if there's way too much conditions to be checked like a highway with multiple exits
        // These can be done with other data types like strings etc. for cases but different data types cannot be mixed in switch statements
        switch (month) {
            case 1: // Since the month is 1, the output will be printed                 // the 'case' keyword evaluates the the variable or expression then gives an ouput
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in the month."); // Output for case(s): 1,3,5,7,8,10,12.
                break;                                            // The 'break' keyword is important here since it cancels the operation and does not execute the other outputs if
            case 2:                                               // the case(s) from 1,3,5,7,8,10,12 is met
                if (!isLeapYear) {
                    System.out.println("28 days in the month.");  // Output for case(s): 2 if it's not a leap year
                } else
                    System.out.println("29 days in the month.");  // Output for case(s): 2 if it's a leap year
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in the month.");     // Output for case(s): 4,6,9,11
                break;
            default:                                             // If all fails(none of the cases above are meet), the
                System.out.println("Invalid month.");            // 'default' will execute. The default can be placed
                                                                 // anywhere throught the switch statement
        }

        // ===== String Switch Example =====
        String day = "MONDAY";
        switch (day.toLowerCase()) {

            case "monday":
                System.out.println("Start of the week!");
                break;

            case "friday":
                System.out.println("Almost weekend!");
                break;

            case "saturday":
            case "sunday":
                System.out.println("Weekend!");
                break;

            default:
                System.out.println("Midweek day.");
        }


    }
}

/*

NB: The 'default' case is not always needed nor has to be always below the all of the other cases but it's good practise to do so


*/