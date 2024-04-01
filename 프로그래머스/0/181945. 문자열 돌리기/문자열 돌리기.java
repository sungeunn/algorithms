import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] change = a.toCharArray();
        for (char word : change) {
            System.out.println(word);
        }
    }
}