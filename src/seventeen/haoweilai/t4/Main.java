package seventeen.haoweilai.t4;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 22:07
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] data = temp.split(" +");

        System.out.print(data[data.length-1]);
        for(int i = data.length-2 ;i>= 0 ;i--) {
            System.out.print(" "+data[i]);
        }
    }
}
