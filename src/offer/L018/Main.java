package offer.L018;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/17
 * Time: 17:32
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
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);
    }
}
