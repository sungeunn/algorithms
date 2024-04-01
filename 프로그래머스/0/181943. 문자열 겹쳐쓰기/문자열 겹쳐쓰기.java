class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
        
        String str1 = my_string.substring(0, s);
        String str2 = str1 + overwrite_string;
        String str3 = my_string.substring(str2.length(), my_string.length());

		return str2 + str3;
	}
}