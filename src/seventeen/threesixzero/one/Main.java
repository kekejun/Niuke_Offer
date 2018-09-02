package seventeen.threesixzero.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/2
 * Time: 17:54
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = sc.readLine();
            String first = sc.readLine();
            String second = sc.readLine();

            int flag = 0;

            if(data.matches(".*"+first+".*"+second+".*")) {
                flag += 1;
            }

            StringBuilder sb = new StringBuilder(data);
            sb = sb.reverse();

            if(sb.toString().matches(".*"+first+".*"+second+".*")) {
                flag += 2;
            }
            if(flag == 0 ) {
                System.out.println("invalid");
            } else if(flag == 1) {
                System.out.println("forward");
            } else if(flag == 2) {
                System.out.println("backward");
            } else if(flag == 3) {
                System.out.println("both");
            }
        }
    }
}
