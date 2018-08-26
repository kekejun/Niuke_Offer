package L051;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 19:06
 */
public class Main {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A.length < 1)
            return B;

        B[0] = 1;
        for(int i = 1; i< A.length ;i++ ) {
            B[i] = B[i-1] * A[i-1];
        }

        int temp = 1;
        for(int i = A.length-2 ;i>= 0 ;i -- ) {
            temp *= A[i+1];
            B[i] *= temp;
        }

        return B;
    }

    public static void main(String[] args) {
        new Main().multiply(new int[]{1,2,3,4,5});
    }
}
