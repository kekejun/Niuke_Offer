package L038;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 21:35
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
    public int max = 1;
    public int TreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        dfs(root,1);
        System.out.println(max);
        return max;
    }
    public int dfs(TreeNode root,int level) {
        if(level>max)
            max = level;
        if(root.left != null)
            dfs(root.left,level+1);
        if(root.right!=null)
            dfs(root.right,level+1);
        return max;
    }
}
