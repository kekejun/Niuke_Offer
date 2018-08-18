package L023;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/18
 * Time: 19:16
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
    ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return listArray;
        dfs(root, 0, target);
        return listArray;
    }

    public void dfs(TreeNode now, Integer sum, Integer target) {
        if(now == null)
            return;

        sum += now.val;
        list.add(now.val);

        if(now.left == null && now.right == null){
            if (sum == target) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(list);
                listArray.add(temp);
            }
        } else {
            dfs(now.left, sum, target);
            dfs(now.right, sum, target);
        }
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        Main main = new Main();
        main.FindPath(root, 15);

        System.out.println(main.listArray);
    }
}
