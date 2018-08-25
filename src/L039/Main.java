package L039;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 21:49
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

    public int isBalanced = 0;
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null )
            return true;
        getDepth(root);
        return isBalanced == 1?false :true;
    }

    public int getDepth(TreeNode node) {
        if(node == null)
            return 0;
        int left = getDepth(node.left);
        int right = getDepth(node.right);

        if(Math.abs(left-right)>1) {
            isBalanced = 1;
        }
        return right>left ? right+1:left+1;
    }
}
