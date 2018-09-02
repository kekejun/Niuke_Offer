package offer.L053;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 22:17
 */
public class Main {
    public boolean isNumeric(char[] str) {
        boolean sign = false,decimal = false,hasE = false;
        for(int i = 0 ;i< str.length ;i++ ){
            if(str[i] == 'E' || str[i] == 'e') {
                if(hasE)
                    return false;
                hasE = true;
                if(i == str.length-1)
                    return false;
            } else if(str[i] == '.') {
                if(hasE || decimal)
                    return false;
                decimal = true;
            } else if(str[i]=='+' || str[i]=='-') {
                if(!sign && i>0 && str[i-1]!='e' && str[i-1]!='E') {
                    return false;
                }
                if(sign && str[i-1]!='e' && str[i-1]!='E') {
                    return false;
                }
                sign = true;
            } else if(str[i]>'9' || str[i]<'0'){
                return false;
            }
        }
        return true;
    }
}
