package offer.L034;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 18:28
 */
public class Main {
    public int FirstNotRepeatingChar(String str) {
        int[] data = new int[52];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                data[str.charAt(i) - 'A' + 26]++;
            else
                data[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && data[str.charAt(i) - 'A' + 26] == 1) {
                return i;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' && data[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Main().FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }
}
