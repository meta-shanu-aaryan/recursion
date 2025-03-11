class CalculateNqueen {

    static boolean isSafe(int[][] mat, int row, int col) {
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
    }

    static boolean placeQueens(int row, int[][] mat) {
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
    }

    public int[][] nQueens(int n) {
        int[][] arr = new int[n][n];

        if (placeQueens(0, arr)) {
            return arr;
        } else {

            return new int[][] { { -1 } };

        }
    }
}

public class NQueen {

    public static void main(String[] args) {
        CalculateNqueen cq = new CalculateNqueen();
        int[][] arr = cq.nQueens(5);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}