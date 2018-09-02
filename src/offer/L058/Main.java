package offer.L058;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 11:37
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
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null)
            return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean isSymmetrical(TreeNode left,TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        return left.val == right.val && isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }
}
