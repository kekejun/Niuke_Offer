package offer.L027;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/18
 * Time: 21:11
 */
public class Main {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();

        if(str == null || str.length() == 0)
            return result;

        char[] strs = str.toCharArray();

        TreeSet<String> treeResult = new TreeSet<>();
        Permutation(treeResult,strs,0);
        result.addAll(treeResult);
        return result;
    }

    public void Permutation(TreeSet<String> treeResult, char[] strs,Integer nowIndex) {
        if(nowIndex == strs.length -1) {
            treeResult.add(String.valueOf(strs));
        } else {
            for(int i = nowIndex ;i< strs.length ;i++ ){
                char temp = strs[i];
                strs[i] = strs[nowIndex];
                strs[nowIndex] = temp;
                Permutation(treeResult,strs,nowIndex+1);
                strs[nowIndex] = strs[i];
                strs[i] = temp;
            }
        }

    }
}
