package seventeen.didi.t6;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/6
 * Time: 11:25
 */
public class Main {

    public static int count = 0;
    public static int n;
    public static int m;
    public static int[] data;

    public static void dfs(int now,int result) {
        if(result == m) {
            count++;
            return;
        }
        if(now >= n || result > m ) {
            return;
        }

        for(int i = now ; i< n ;i++ ) {
            dfs(i+1,result+data[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        data = new int[n];

        for(int i = 0 ;i< n ;i++ ) {
            data[i] = sc.nextInt();
        }

        dfs(0,0);

        System.out.println(count);
    }
}
