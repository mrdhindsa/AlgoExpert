import java.util.*; // O(n*n) time complexity and O(n) space complexity
class Program {
	
  public static String longestSubstringWithoutDuplication(String str) {
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
}

