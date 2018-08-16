package L005;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 19:16
 */
public class Main {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while (!stack1.empty()){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(1);
        main.push(2);
        main.push(3);
        System.out.println(main.pop());
    }
}
