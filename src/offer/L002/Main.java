package offer.L002;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/15
 * Time: 19:52
 */
public class Main {
    public String replaceSpace(StringBuffer str) {
        String s = "%20";
        for(int i = 0 ;i< str.length() ;i++ ){
            if(str.charAt(i) == ' '){
                str.replace(i,i+1,s);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main().replaceSpace(new StringBuffer("We Are Happy")));
    }
}
