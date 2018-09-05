package seventeen.haoweilai.t1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 21:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int max = -1,maxN = -1,count = 0;
        for(int i = 1 ;i< data.length() ;i++ ) {
            if(data.charAt(i)>='0' && data.charAt(i) <='9') {
                count++;
                if(count > max) {
                    max = count;
                    maxN = i;
                }
            } else {
                count = 0;
            }
        }
        for(int i = maxN-max+1 ;i<= maxN ;i++ ) {
            System.out.print(data.charAt(i));
        }
        System.out.println();
    }
}
