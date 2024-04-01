class Solution {
    public int solution(int n, String control) {
        
        char[] ch = control.toCharArray();
        for (int i =0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'w' :  n = n + 1;
                            continue;
                case 's' :  n = n - 1;
                            continue;
                case 'd' :  n = n + 10;
                            continue;
                case 'a' :  n = n - 10;
                            continue;
            }
        }
        
        return n;
    }
}