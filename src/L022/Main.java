package L022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/17
 * Time: 21:38
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode now = queue.poll();
            if( now!=null ){
                list.add(now.val);
                queue.add(now.left);
                queue.add(now.right);
            }
        }
        return list;
    }
}
