package seventeen.didi.t1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/5
 * Time: 18:38
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0,max = 0;
        for(int i = 0 ;i< n ;i++ ) {
            int now = sc.nextInt();
            if(now > 0) {
                count += now;
            } else {
                count = 0;
            }
            if(max < count)
                max = count;
        }
        System.out.println(max);
    }
}
