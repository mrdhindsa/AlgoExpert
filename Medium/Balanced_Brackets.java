// Given a string of Brackets, return true or false if it is a balanced equation
// O(n) time and space

import java.util.*;
public static boolean balancedBrackets(String str) {
  if(str.length() % 2 != 0) return false;
  Stack<Character> stack = new Stack<Character>(); 
  for(int i = 0; i < str.length(); i++){
    char letter = str.charAt(i);
    if(letter == '[' || letter == '(' || letter == '{') stack.push(letter);
    else if(letter == ']' || letter == ')' || letter == '}'){
      if(stack.size() == 0) return false;
      else if((letter == ']' && stack.peek() == '[') ||
              (letter == ')' && stack.peek() == '(') ||
              (letter == '}' && stack.peek() == '{')) stack.pop();
      else{
        return false;
      }
    }
    else{ return false; }
  }
  if(stack.size() != 0) return false;
  return true;
}

// Another implementation Using HashMap
