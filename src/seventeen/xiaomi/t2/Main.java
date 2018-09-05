package seventeen.xiaomi.t2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/5
 * Time: 17:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        int[] flag = new int[n];

        data[0] = 1;
        int max = 0;
        for(int i = 0 ;i< n-1 ;i++ ) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            flag[a]++;
            if(flag[a] <= 2) {
                data[b] = data[a] + 1;
                if(max < data[b]) {
                    max = data[b];
                }
            }
        }
        System.out.println(max);
    }
}
