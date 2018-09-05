package seventeen.xiaomi.t3;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/5
 * Time: 18:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] data = str.split(" ");
        System.out.print(data[data.length-1]);
        for(int i = data.length-2 ;i>= 0 ;i-- ) {
            System.out.print(" "+data[i]);
        }
        System.out.println();
    }
}
