package L026;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/18
 * Time: 20:08
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
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        if(pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;

        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;

        while (p!=null && p.right !=null) {
            p = p.right;
        }

        if(left != null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }

        TreeNode right = Convert(pRootOfTree.right);
        if( right != null ) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }

        return left!=null ? left : pRootOfTree;
    }

}
