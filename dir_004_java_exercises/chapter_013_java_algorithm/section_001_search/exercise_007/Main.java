import java.util.*;

public class Main {

    public static void main(String[] args) {
        int nums[][] = { { 12, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 24, 29, 39, 51 },
                { 35, 30, 39, 50 },
                { 50, 60, 75, 72 } };

        int rows = 5;
        int search_element = 39;
        int ans[] = Saddleback(nums, rows - 1, 0, search_element);
        System.out.println("Position of " + search_element + " in the matrix is (" + ans[0] + "," + ans[1] + ")");
    }

    /**
     * @param nums,          the matrix.
     * @param row            the current row.
     * @param col            the current column.
     * @param search_element the element that we want to search for.
     * @return value: If found the index(row and column) of the element.
     *         else return (-1 -1).
     */
    private static int[] Saddleback(int nums[][], int row, int col, int search_element) {

        // numsay to store the row and column of the searched element
        int element_pos[] = { -1, -1 };
        if (row < 0 || col >= nums[row].length) {
            return element_pos;
        }
        if (nums[row][col] == search_element) {
            element_pos[0] = row;
            element_pos[1] = col;
            return element_pos;
        }
        // move up if the current element is greater than the given element
        else if (nums[row][col] > search_element) {
            return Saddleback(nums, row - 1, col, search_element);
        }
        // otherwise move right
        return Saddleback(nums, row, col + 1, search_element);
    }

    /**
     * Main method
     *
     * @param args Command line arguments
     */

}
