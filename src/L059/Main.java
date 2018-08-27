package L059;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 21:26
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
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null)
            return result;

        boolean flag = true;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(pRoot);

        while (queue.size()!=1) {
            TreeNode now = queue.removeFirst();
            if(now == null) {
                Iterator<TreeNode> iter = null;
                if(flag) {
                    iter = queue.iterator();
                } else {
                    iter = queue.descendingIterator();
                }
                flag = !flag;
                while (iter.hasNext()) {
                    TreeNode temp = iter.next();
                    list.add(temp.val);
                }
                result.add(new ArrayList<>(list));
                list.clear();
                queue.add(null);
                continue;
            }
            if(now.left!=null) {
                queue.addLast(now.left);
            }
            if(now.right != null) {
                queue.addLast(now.right);
            }
        }
        return result;
    }
}
