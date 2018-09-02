package offer.L043;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 18:29
 */
public class Main {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.length()<n)
            return "";
        return str.substring(n)+str.substring(0,n);
    }
}
