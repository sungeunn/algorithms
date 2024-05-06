import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp != arr[i]) {
                answer.add(temp);
            }
            temp = arr[i];
        }
        answer.add(arr[arr.length-1]);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}