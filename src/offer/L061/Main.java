package offer.L061;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 12:10
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
    String Serialize(TreeNode root) {
        if(root == null)
            return null;
        return Serialize2(root).toString();
    }
    StringBuffer Serialize2(TreeNode root) {
        if(root == null)
            return new StringBuffer("#,");
        StringBuffer sb = new StringBuffer();
        sb.append(root.val).append(",");
        sb.append(Serialize2(root.left));
        sb.append(Serialize2(root.right));
        return sb;
    }
    int index = -1;
    String[] data;
    TreeNode Deserialize(String str) {
        if(str==null || str.length() <1 )
            return null;
        data = str.split(",");
        return Deserialize2();
    }
    TreeNode Deserialize2() {
       index++;
       if(index > data.length)
           return null;
       if(!data[index].equals("#")) {
           TreeNode node = new TreeNode(Integer.valueOf(data[index]));
           node.left = Deserialize2();
           node.right = Deserialize2();
           return node;
       }
       return null;
    }
}
