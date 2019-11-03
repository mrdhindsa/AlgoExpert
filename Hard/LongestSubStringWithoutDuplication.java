import java.util.*;
class Program {
	
  public static String longestSubstringWithoutDuplication(String str) { // O(n*n) time complexity and O(n) space complexity
    int max = Integer.MIN_VALUE, size = str.length();
    String to_return = "";
    ArrayList<Character> chars = new ArrayList<Character>();
    for(int i = 0; i < size; i++){
      String temp = "";
      int k = i;
      while(k < size){
	char letter = str.charAt(k);
	if(chars.contains(letter)){
	  break;
	}
	chars.add(letter);
	temp += letter;
	k++;
      }
      if(chars.size() > max){
	max = chars.size();
	to_return = temp;
      }
      chars.clear();
    }
    return to_return;
  }
	
  // Another Implementation, Look at each possible substring
  public static boolean hasduplicate(String s){ // O(n) time and space where n is length of s
	HashSet<Character> hash = new HashSet<Character>();
	for(char letter : s.toCharArray()){
		if(hash.contains(letter)) 
			return true;
		hash.add(letter);
	}
	return false;
  }

  public static String longestSubstringWithoutDuplication(String str) { // O(n*n) time, space for substrings is a summation = n*(n-1) / 2
  	ArrayList<String> substrings = new ArrayList<String>();
	for(int i = 0; i < str.length(); i++){
		for(int j = i + 1; j <= str.length(); j++){
			substrings.add(str.substring(i,j));
		}
	}
	int max_size = Integer.MIN_VALUE;
	String to_return = "";
	for(String s : substrings){ 
		if(!hasduplicate(s) && s.length() > max_size){
			max_size = s.length();
			to_return = s;
		}
	}
	return to_return;
  }
}
