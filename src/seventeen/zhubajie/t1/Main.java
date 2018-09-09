package seventeen.zhubajie.t1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/6
 * Time: 12:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] data = new String[n];
            for(int i = 0 ;i< n ;i++ ) {
                data[i] = String.valueOf(sc.nextInt());
            }
            Arrays.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2+o1).compareTo(o1+o2);

                }
            });
            for(int i = 0 ;i< n ;i++ ) {
                System.out.print(data[i]);
            }
            System.out.println();
        }
    }
}
