package L062;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 13:36
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
    int now = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null)
            return null;
        if(pRoot.left == null && pRoot.right == null) {
            now++;
            return now == k ? pRoot :null;
        }
        TreeNode temp = KthNode(pRoot.left,k);
        if(temp != null)
            return temp;
        now++;
        if(now == k)
            return pRoot;
        temp = KthNode(pRoot.right,k);
        if(temp != null)
            return temp;
        return null;
    }
}
