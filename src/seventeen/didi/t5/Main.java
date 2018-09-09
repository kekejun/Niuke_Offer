package seventeen.didi.t5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/6
 * Time: 11:07
 */
public class Main {

    static void dfs(int a,int b) {
        if(a == 0)
            return;
        dfs(a/b,b);
        int now = a%b;

        if(now > 9) {
            now += 55;
            System.out.print((char)now);
        } else {
            System.out.print(now);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < 0)
            System.out.print('-');
        dfs(Math.abs(a),b);
    }
}
