package Enums;

public enum Day {

        SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
        THURSDAY(5), FRIDAY(6), SATURDAY(7);

        private final int dayNumber;

        Day(int dayNumber) {              // Constructor(must be private)
            this.dayNumber = dayNumber;
        }

        public int getDayNumber(){       // Method to give day number
            return this.dayNumber;
        }

}
