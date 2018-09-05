package seventeen.haoweilai.t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 22:19
 */
public class Main {

    public static List<Integer> list = new ArrayList<>();

    static void dfs(int now,int end, int sum, int result) {
        if(sum == result) {
            System.out.print(list.get(0));
            for(int i =1 ;i< list.size() ;i++ ) {
                System.out.print(" "+list.get(i));
            }
            System.out.println();
            return;
        }
        for(int i = now ;i<= end; i++ ) {
            list.add(i);
            dfs(i+1,end,sum+i,result);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        dfs(1,a,0,b);
    }
}
