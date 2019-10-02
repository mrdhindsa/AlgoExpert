// Given a string and a key, shift each letter in string by k (alphabetically)
public static char shift_char(char ch, int key){
  int asci = ch;
  asci += key;
  if(asci > 122) asci -= 26;
  return (char) asci;
}

public static String caesarCypherEncryptor(String str, int key){
  if(key > 26) key %= 26;
  char[] chars = str.toCharArray();
  for(int i = 0; i < chars.length; i++){
    chars[i] = shift_char(chars[i], key);
  }
  return new String(chars);
}
