import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }

    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;
    }
}