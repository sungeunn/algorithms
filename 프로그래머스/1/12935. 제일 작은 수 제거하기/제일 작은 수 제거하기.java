import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] copyOfArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArr);
        
        int min = copyOfArr[0];
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min)
                answer.add(arr[i]);
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}