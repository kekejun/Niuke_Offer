package seventeen.haoweilai.t3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 21:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(" ");
        int[] data = new int[temp.length];
        for(int i = 0 ;i< temp.length ;i++ ) {
            data[i] = Integer.parseInt(temp[i]);
        }
        int num = data[data.length-1];
        Arrays.sort(data,0,data.length-1);

        System.out.print(data[0]);
        for(int i = 1 ;i< num ;i++ ) {
            System.out.print(" "+data[i]);
        }
    }
}
