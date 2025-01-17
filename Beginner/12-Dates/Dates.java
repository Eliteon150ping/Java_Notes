package Beginner;

import java.time.LocalDate;                   // Represents a date (year, month, day) without a time-zone.
import java.time.LocalTime;                   // Represents a time (hour, minute, second, nanosecond) without a date or time-zone.
import java.time.LocalDateTime;               // Represents both date and time without a time-zone.
import java.time.format.DateTimeFormatter;    // Used for formatting and parsing dates.
import java.time.ZonedDateTime;               // Represents a date-time with a time-zone.
import java.time.Period;                      // Used to represent differences in dates and times.
import java.time.Duration;                    // Used to represent differences in dates and times.
import java.time.chrono.*;                    // Converts the default calendar of Gregorian to whichever country you desire

public class Dates {

    public static void main(String[] args) {

        // LocalDate variableName = LocalDate.now();
        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date: "+ myDate); // Shows the current date in year/month/day

        // Create a specific date using the .of() method
        LocalDate specificDate = LocalDate.of(2005, 05, 03);
        System.out.println("Specific Created Date: " + specificDate);

        // Shows the current time(hour, minute, second, nanosecond)
        LocalTime myTime = LocalTime.now();
        System.out.println("My Time: " + myTime);

        // Shows the current date(year, month, day) and time(hour, minute, second, nanosecond)
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println("My LocalDateTime: " + myLocalDateTime);

        // Set your way of wanting to display the date and time using the DateTimeFormatter NB: There's table at the end with more options for customising
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Shows in day/month/year and hour/minutes/seconds
        String formattedDate = myLocalDateTime.format(formatter);

        System.out.println("Formatted Date: " + formattedDate);

        // You can compare dates using the .isBefore(), .isAfter() and .isEqual() method
        LocalDate date1 = LocalDate.of(2019, 05, 15);
        LocalDate date2 = LocalDate.of(2020, 05, 15);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }

        // Shows the current date and time in your region(country and city)
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned DateTime: " + zonedDateTime);

        // Convert the date to another country eg. Japan
        LocalDate JapanDate = LocalDate.now();
        JapaneseDate jDate = JapaneseDate.from(JapanDate);
        System.out.println("Japanese date: "+ jDate);

        // Adding,subtracting days using the .plusDays() and .minusDays() methods NB: Can work with months and years, just make sure its with dates
        LocalDate nextWeek = myDate.plusDays(7);
        LocalDate lastWeek = myDate.minusDays(7);
        LocalDate nextMonth = myDate.plusMonths(1);
        LocalDate lastMonth = myDate.plusMonths(1);
        LocalDate nextYear = myDate.plusYears(1);
        LocalDate lastYear = myDate.minusYears(1);

        // NB This works with time too but use localTime instead of localDate

        System.out.println("Today: " + myDate);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Week: " + lastWeek);
        System.out.println("Next Month: " + nextMonth);
        System.out.println("Last Month: " + lastMonth);
        System.out.println("Next Year: " + nextYear);
        System.out.println("Last Year: " + lastYear);



    }
}

/*

Why Use java.time Over java.util.Date?

1) Immutability: The java.time classes are immutable and thread-safe.
2) Readable API: The methods in java.time are more intuitive than those in java.util.Date.
3) Time-Zone Support: The java.time package provides comprehensive time-zone support.

//////////////////////////////////////////////////
Patterns for Formatting and Parsing dates and time

+--------+-----------------------------+-------------------+------------------------------------+
| Symbol | Meaning                     | Presentation      | Examples                           |
+--------+-----------------------------+-------------------+------------------------------------+
| G      | era                         | text              | AD; Anno Domini; A                |
| u      | year                        | year              | 2004; 04                          |
| y      | year-of-era                 | year              | 2004; 04                          |
| D      | day-of-year                 | number            | 189                                |
| M/L    | month-of-year               | number/text       | 7; 07; Jul; July; J               |
| d      | day-of-month                | number            | 10                                 |
+--------+-----------------------------+-------------------+------------------------------------+
| Q/q    | quarter-of-year             | number/text       | 3; 03; Q3; 3rd quarter            |
| Y      | week-based-year             | year              | 1996; 96                          |
| w      | week-of-week-based-year     | number            | 27                                 |
| W      | week-of-month               | number            | 4                                  |
| E      | day-of-week                 | text              | Tue; Tuesday; T                   |
| e/c    | localized day-of-week       | number/text       | 2; 02; Tue; Tuesday; T            |
| F      | week-of-month               | number            | 3                                  |
+--------+-----------------------------+-------------------+------------------------------------+
| a      | am-pm-of-day                | text              | PM                                 |
| h      | clock-hour-of-am-pm (1-12)  | number            | 12                                 |
| K      | hour-of-am-pm (0-11)        | number            | 0                                  |
| k      | clock-hour-of-am-pm (1-24)  | number            | 0                                  |
+--------+-----------------------------+-------------------+------------------------------------+
| H      | hour-of-day (0-23)          | number            | 0                                  |
| m      | minute-of-hour              | number            | 30                                 |
| s      | second-of-minute            | number            | 55                                 |
| S      | fraction-of-second          | fraction          | 978                                |
| A      | milli-of-day                | number            | 1234                               |
| n      | nano-of-second              | number            | 987654321                          |
| N      | nano-of-day                 | number            | 1234000000                         |
+--------+-----------------------------+-------------------+------------------------------------+
| V      | time-zone ID                | zone-id           | America/Los_Angeles; Z; -08:30     |
| z      | time-zone name              | zone-name         | Pacific Standard Time; PST         |
| O      | localized zone-offset       | offset-O          | GMT+8; GMT+08:00; UTC-08:00        |
| X      | zone-offset 'Z' for zero    | offset-X          | Z; -08; -0830; -08:30; -083015     |
| x      | zone-offset                 | offset-x          | +0000; -08; -0830; -08:30; -083015 |
| Z      | zone-offset                 | offset-Z          | +0000; -0800; -08:00               |
+--------+-----------------------------+-------------------+------------------------------------+
| p      | pad next                    | pad modifier      | 1                                  |
+--------+-----------------------------+-------------------+------------------------------------+
| '      | escape for text             | delimiter         |                                    |
| ''     | single quote                | literal           | '                                  |
| [      | optional section start      |                   |                                    |
| ]      | optional section end        |                   |                                    |
| #      | reserved for future use     |                   |                                    |
| {      | reserved for future use     |                   |                                    |
| }      | reserved for future use     |                   |                                    |
+--------+-----------------------------+-------------------+------------------------------------+


*/
