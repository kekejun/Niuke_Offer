package L004;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/15
 * Time: 20:11
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return dfs(pre,in,0,0,pre.length-1);
    }
    public TreeNode dfs(int[] pre,int [] in,int root,int begin,int end) {
        if(begin > end)
            return null;
        int middle = begin;
        for(middle = begin ;middle < end ;middle++){
            if(in[middle] == pre[root])
                break;
        }
        TreeNode treeNode = new TreeNode(pre[root]);
        treeNode.left = dfs(pre,in,root+1,begin,middle-1);
        treeNode.right = dfs(pre,in,root+middle-begin+1,middle+1,end);

        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode treeNode = new Main().reConstructBinaryTree(pre,in);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode now = queue.poll();
            System.out.println(now.val+" ");
            if(now.left!=null)
                queue.add(now.left);
            if(now.right!=null)
                queue.add(now.right);
        }
    }
}
