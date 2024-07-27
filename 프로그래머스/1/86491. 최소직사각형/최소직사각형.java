import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] min = new int[sizes.length];
        int[] max = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            min[i] = Math.min(size[0], size[1]);
            max[i] = Math.max(size[0], size[1]);
        }
        
        Arrays.sort(min);
        Arrays.sort(max);
        
        return min[min.length - 1] * max[max.length - 1];
    }
}