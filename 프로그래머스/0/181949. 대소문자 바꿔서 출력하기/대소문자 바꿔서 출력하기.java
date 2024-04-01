import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] change = a.toCharArray();
        
        for (int i = 0; i < change.length; i++) {

			if (change[i] >= 'A' && change[i] <= 'Z') {
				change[i] = (char) (change[i] + 32);
			} else {
				change[i] = (char) (change[i] - 32);
            }
        }
        System.out.println(change);
    }

}