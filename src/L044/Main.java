package L044;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 18:37
 */
public class Main {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0 )
            return "";

        if(str.matches(" +"))
            return str;

        String[] strs = str.split(" ");
        System.out.println(strs.length);
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length-1 ;i>=0 ;i-- ) {
            if(i == 0)
                sb.append(strs[i]);
            else
                sb.append(strs[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new Main().ReverseSentence("     ");
    }
}
