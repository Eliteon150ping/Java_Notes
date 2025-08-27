package Beginner;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        // A two-dimensional array (an array of arrays) is similar to a spreadsheet with multiple columns (each column represents one array or list of items) and multiple rows
        // Idealy used for tables
        // Syntax: type [][] arrayName
        int [][] yearlySales;          // Declare a 2d array NB: This can be as many dimensions as you want, the more '[]' you add the bigger the dimension of the array will be.

        yearlySales = new int[5][4];   // This creates 5 rows and 4 columns(number of arrays(5), length(4)) ----> 5 arrays of 4 elements each

        yearlySales[0][0] = 1000;      // At quarter 1 of year 1 there's a 1000 sales
        yearlySales[0][1] = 1500;      // At quarter 2 of year 1 there's a 1500 sales
        yearlySales[0][2] = 1800;      // At quarter 3 of year 1 there's a 1800 sales
        yearlySales[1][0] = 1000;      // At quarter 1 of year 2 there's a 1000 sales
        yearlySales[3][3] = 2000;      // At quarter 4 of year 4 there's a 2000 sales

        System.out.println(yearlySales[0][2]);

        // ---------- 2D Array Nested Loop ----------
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n2D Array values:");
        for (int row = 0; row < matrix.length; row++) {          // Outer loop for rows
            for (int col = 0; col < matrix[row].length; col++) { // Inner loop for columns
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }
}

/*

Here's a visual representation of the data in a table:

+------+-----------+-----------+-----------+-----------+
| Year | Quarter 1 | Quarter 2 | Quarter 3 | Quarter 4 |
+------+-----------+-----------+-----------+-----------+
|  1   |   1000    |   1500    |   1800    |           |
+------+-----------+-----------+-----------+-----------+
|  2   |   1000    |           |           |           |
+------+-----------+-----------+-----------+-----------+
|  3   |           |           |           |           |
+------+-----------+-----------+-----------+-----------+
|  4   |           |           |           |   2000    |
+------+-----------+-----------+-----------+-----------+


*/