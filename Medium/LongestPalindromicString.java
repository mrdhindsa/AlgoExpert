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
    String to_return = "";
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < str.length(); i++){
      for(int j = i+1; j <= str.length(); j++){
	String s = str.substring(i,j);
	if(isPalindrome(s) && max < s.length()){
	  max = s.length();
	  to_return = s;
	}
      }
    }
    return to_return;
  }
}
