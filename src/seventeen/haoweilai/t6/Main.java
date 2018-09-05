package seventeen.haoweilai.t6;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 22:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1.replaceAll("["+str2+"]",""));
    }
}
