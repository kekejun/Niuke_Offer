package L006;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 19:52
 */
public class Main {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        int end = array.length-1;
        int begin = 0;

        while(true){
            if(array[begin] < array[end] || begin == end)
                return array[begin];
            if(array[(begin+end)/2] >= array[end])
                begin = (begin+end)/2+1;
            else
                end = (begin+end)/2;
        }
    }

    public static void main(String[] args) {
        int array[] = {2,2,2,2,1,2};
        System.out.println(new Main().minNumberInRotateArray(array));
    }
}
