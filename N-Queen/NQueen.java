import java.util.InputMismatchException;
import java.util.Scanner;

class CalculateNqueen {

    /**
     * Takes the mat that is array and checks if it is safe to put queen in the
     * plcae
     * 
     * @param mat The array on which we are placing queen
     * @param row Row where we are placing queen
     * @param col Column where we are plcing queen
     * @return true if it is safe to plce queen else false
     */
    static boolean isSafe(int[][] mat, int row, int col) {
        try {

            int n = mat.length;

            for (int i = 0; i < row; i++) {
                if (mat[i][col] == 1) {
                    return false;
                }
            }

            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (mat[i][j] == 1) {
                    return false;
                }
            }

            for (int i = row - 1, j = col + 1; j < n && i >= 0; i--, j++) {
                if (mat[i][j] == 1) {
                    return false;
                }
            }

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Takes row and the mat array and places the queen in the safe place and if it
     * possible to place the queen
     * 
     * @param row Takes Row where to place queen
     * @param mat takes the array on which we are placing queen
     * @return true if it successfully places the queen else false
     */
    static boolean placeQueens(int row, int[][] mat) {
        try {

            int n = mat.length;

            if (row == n) {
                return true;
            }

            for (int i = 0; i < n; i++) {
                if (isSafe(mat, row, i)) {
                    mat[row][i] = 1;
                    if (placeQueens(row + 1, mat)) {
                        return true;
                    }
                    mat[row][i] = 0;

                }
            }

            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Takes the size of array as input and places queens in safe places
     * 
     * @param n Size of n X n array
     * @return arr such that the queens are placed safely else -1
     */
    public int[][] nQueens(int n) {
        try {

            int[][] arr = new int[n][n];

            if (placeQueens(0, arr)) {
                return arr;
            } else {

                return new int[][] { { -1 } };

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new int[][] { { -1 } };
        }
    }
}

public class NQueen {

    public static void main(String[] args) {
        CalculateNqueen cq = new CalculateNqueen();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of board ");
            int boardSize = sc.nextInt();
            int[][] arr = cq.nQueens(boardSize);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Positive Integer Value only");
        } catch (Exception x) {
            System.out.println(x.getMessage());
        } finally {
            sc.close();
        }

    }
}