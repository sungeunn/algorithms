class Solution {
    public String solution(String phone_number) {
        String substring = phone_number.substring(0, phone_number.length()-4);
        String replace = phone_number.replace(substring, "*".repeat(substring.length()));
        return replace;
    }
}