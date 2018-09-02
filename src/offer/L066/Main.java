package offer.L066;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 16:48
 */
public class Main {
    public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols];
        return find(threshold,rows,cols,0,0,flag);
    }

    public int find(int threshold,int rows,int cols,int row,int col,int[][] flag) {
        if(row<0 || row>=rows || col<0 || col>=cols || flag[row][col] == 1)
            return 0;
        flag[row][col] = 1;
        if(getNum(row)+getNum(col)>threshold)
            return 0;

        return 1+find(threshold,rows,cols,row+1,col,flag)+find(threshold,rows,cols,row,col+1,flag);
    }

    private int getNum(int data) {
        int sum = 0;
        while (data!=0) {
            sum+=data%10;
            data = data/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Main().movingCount(15,20,20));

    }
}
