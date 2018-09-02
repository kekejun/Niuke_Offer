package offer.L065;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 17:29
 */
public class Main {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i * cols + j] == str[0]) {
                    System.out.println(i + " " + j);
                    int flag[] = new int[matrix.length];
                    if (find(matrix, rows, cols, i, j, 0, str, flag)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean find(char[] matrix, int rows, int cols, int row, int col, int index, char[] str, int[] flag) {

        if (row < 0 || row >= rows || col < 0 || col >= cols ) {
            return false;
        }
        if(matrix[row * cols + col] != str[index] || flag[row * cols + col] == 1) {
            return false;
        }
        flag[row * cols + col] = 1;
        if (index == str.length - 1) {
            return true;
        }
        boolean b = find(matrix, rows, cols, row - 1, col, index + 1, str, flag) ||
                find(matrix, rows, cols, row + 1, col, index + 1, str, flag) ||
                find(matrix, rows, cols, row, col - 1, index + 1, str, flag) ||
                find(matrix, rows, cols, row, col + 1, index + 1, str, flag);

        flag[index] = 0;
        return b;
    }

    public static void main(String[] args) {
        char[] ch1 = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray();
        char[] ch2 = "SLHECCEIDEJFGGFIE".toCharArray();
        new Main().hasPath(ch1, 5, 8, ch2);
    }
}
