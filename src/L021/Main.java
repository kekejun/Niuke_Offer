package L021;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 18:45
 */

public class Main {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int[] data = new int[1000000];
        for(int i = 0 ;i< pushA.length ;i++ )
            data[pushA[i]] = i+1;
        if(data[popA[0]] == 0)
            return false;
        int min = popA[0];
        for(int i = 1 ;i< popA.length ;i++ ){
            if(data[popA[i]] == 0)
                return false;
            if(min - data[popA[i]] >= 2)
                return false;
            else if(min > data[popA[i]])
                min = data[popA[i]];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {2};
        System.out.println(new Main().IsPopOrder(array1,array2));
    }
}

