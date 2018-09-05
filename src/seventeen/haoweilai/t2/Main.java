package seventeen.haoweilai.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 21:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0,now = 101;
        while (sc.hasNext()) {
            int temp = sc.nextInt();

            if(temp != now) {
                count--;
                if(count <= 0) {
                    now = temp;
                    count = 1;
                }
            } else {
                count++;
            }
        }
        System.out.println(now);
    }
}
