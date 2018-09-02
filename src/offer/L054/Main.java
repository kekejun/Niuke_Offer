package offer.L054;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 22:35
 */
public class Main {

    int[] data = new int[256];
    int index = 1;

    public void Insert(char ch)
    {
        if(data[ch] == 0)
            data[ch] = index++;
        else
            data[ch] = -1;
    }
    public char FirstAppearingOnce()
    {
        char min = '#';
        int minNum = Integer.MAX_VALUE;

        for(int i = 0 ;i< 256 ;i++ ) {
            if(minNum>data[i] && data[i]>=1) {
                minNum = data[i];
                min = (char)i;
            }
        }
        return min;
    }
}
