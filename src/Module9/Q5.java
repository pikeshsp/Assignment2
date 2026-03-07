package Module9;

public class Q5 {
    static int N = 4;

    static boolean isSafe(int board[][], int row, int col) {

        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static boolean solveNQ(int board[][], int row) {

        if (row == N)
            return true;

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                if (solveNQ(board, row + 1))
                    return true;

                board[row][col] = 0; // backtrack
            }
        }
        return false;
    }

    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int board[][] = new int[N][N];

        if (solveNQ(board, 0))
            printSolution(board);
        else
            System.out.println("No solution exists");
    }
}
