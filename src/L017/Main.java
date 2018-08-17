package L017;


/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/17
 * Time: 16:48
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
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2 == null || root1 == null)
            return false;
        //System.out.println(root1.val +" "+root2.val);
        if(root1.val == root2.val) {
            if(isSubTree(root1,root2))
                return true;
        }
        if(HasSubtree(root1.left,root2))
            return true;
        if(HasSubtree(root1.right,root2))
            return true;

        return false;
    }

    public boolean isSubTree(TreeNode root1,TreeNode root2) {
        if(root2 == null)
            return true;
        if(root1 == null || root1.val != root2.val)
            return false;

        return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);

        System.out.println(new Main().HasSubtree(root1,root2));
    }
}
