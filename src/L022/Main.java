package L022;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/17
 * Time: 21:47
 */
public class Main {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        return getPost(0,sequence.length-1,sequence);
    }

    public boolean getPost(int start,int end,int[] sequence) {
        if(start > end)
            return true;

        int i = start;
        for(i = start ;i< end ; i++ ) {
            if(sequence[i] > sequence[end])
                break;
        }
        for(int j = i ;j< end ;j++ ) {
            if(sequence[j] < sequence[end])
                return false;
        }
        return getPost(start,i-1,sequence) && getPost(i,end-1,sequence);
    }

    public static void main(String[] args) {
        int[] array = {4,6,12,8,16,14,10};
        System.out.println(new Main().VerifySquenceOfBST(array));
    }
}
