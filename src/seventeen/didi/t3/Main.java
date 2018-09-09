package seventeen.didi.t3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/6
 * Time: 11:03
 */
public class Main {
    public static ArrayList<Node> result = new ArrayList<>();
    public static ArrayList<Node> now = new ArrayList<>();
    public static int[][] data;
    public static int m,n,power,maxPower = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        power = sc.nextInt();

        data = new int[n][m];

        for(int i = 0 ;i< n ;i++ ) {
            for(int j = 0 ;j< m ;j++ ){
                data[i][j] = sc.nextInt();
            }
        }

        dfs(0,0,0);

        if(result.size() == 0) {
            System.out.println("Can not escape!");
        } else {
            System.out.print("["+result.get(0).getX()+","+result.get(0).getY()+"]");
            for(int i = 1 ;i< result.size() ;i++ ) {
                System.out.print(",["+result.get(i).getX()+","+result.get(i).getY()+"]");
            }
        }
    }

    private static void dfs(int x,int y,int nowPower) {

        if(x < 0 || x>=n || y< 0 || y>= m || nowPower > power || data[x][y] == 0) {
            return;
        }

        if(x == 0 && y == m-1) {
            if(nowPower < maxPower) {
                maxPower = nowPower;
                now.add(new Node(x,y));
                result = new ArrayList<>(now);
                now.remove(now.size()-1);
            }
            return;
        }

        now.add(new Node(x,y));
        data[x][y] = 0;

        dfs(x+1,y,nowPower);
        dfs(x-1,y,nowPower+3);
        dfs(x,y+1,nowPower+1);
        dfs(x,y-1,nowPower+1);

        data[x][y] = 1;
        now.remove(now.size()-1);
    }
}
class Node {
    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
