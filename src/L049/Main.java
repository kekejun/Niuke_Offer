package L049;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 18:49
 */
public class Main {
    public int StrToInt(String str) {
        if( str.length()<1)
            return 0;

        int flag = 0;
        if(str.charAt(0) == '+'){
            flag = 1;
        } else if(str.charAt(0) == '-'){
            flag = 2;
        }

        int sum = 0;
        for(int i = flag==0?0:1 ;i< str.length() ;i++ ) {
            char c = str.charAt(i);
            if(c>='0' && c<='9') {
                sum = sum*10 + (str.charAt(i)-'0');
            } else {
                return 0;
            }
        }

        if(flag == 2)
            sum = -sum;
        return  sum;
    }
}
