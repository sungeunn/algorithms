import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> overlapSet = new HashSet<>();

        for (int l : lost) {
            lostSet.add(l);
        }
        
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                overlapSet.add(r);
            } else {
                reserveSet.add(r);
            }
        }

        for (int r : overlapSet) {
            lostSet.remove(r);
        }

        for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
            } else {
                n--;
            }
        }

        return n;
    }
}