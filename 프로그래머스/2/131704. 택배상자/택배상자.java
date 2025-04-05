import java.util.*;

class Solution {
    public int solution(int[] order) {
        int idx = 0;
        int box = 1;
        
        Stack<Integer> stack = new Stack<>();
        while (box <= order.length) {
            if (box == order[idx]) {
                idx++;
                box++;
            } else if (!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
            } else {
                stack.push(box);
                box++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == order[idx]) {
            stack.pop();
            idx++;
        }

        return idx;
    }
}