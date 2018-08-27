package L060;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 11:48
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int max = 1;
        while (!queue.isEmpty()) {
            ArrayList<Integer> nowList = new ArrayList<>();
            int nowNum = 0;
            System.out.println(max);
            for(int i = 0 ;i< max ;i++ ) {
                TreeNode now = queue.poll();
                nowList.add(now.val);
                if(now.left != null) {
                    queue.add(now.left);
                    nowNum++;
                }
                if(now.right !=null) {
                    queue.add(now.right);
                    nowNum++;
                }
            }
            System.out.println(nowNum);
            max = nowNum;
            list.add(new ArrayList<>(nowList));
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode now = new TreeNode(8);
        now.left = new TreeNode(6);
        now.right = new TreeNode(10);
        new Main().Print(now);

    }
}
