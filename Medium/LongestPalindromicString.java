import java.util.*;
class Brute_Implementation { // O(n*n*n) time complexity (required to create each possible substring) O(n) space complexity
	
  public static boolean isPalindrome(String s){ 
    int left = 0, right = s.length()-1;
    while(left < right){
        if(s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
  }
	
  public static String longestPalindromicSubstring(String str){
		ArrayList<String> sub_strings = new ArrayList<String>();
		for(int i = 0; i < str.length(); i++){
			for(int j = i+1; j <= str.length(); j++){
				sub_strings.add(str.substring(i,j));
			}
		}
		int max = Integer.MIN_VALUE;
		String to_return = "";
		for(String s : sub_strings){
				if(isPalindrome(s) && max < s.length()){
						max = s.length();
						to_return = s;
				}
		}
		return to_return;
  }
}
