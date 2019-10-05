// Method 1: Easy
public static int[] findThreeLargestNumbers(int[] array){ // Brute, simple implemenation
  Arrays.sort(array);
  int size = array.length;
  return new int[]{array[size-3],array[size-2],array[size-1]};
}

// Method 2: Not Using java.util.Arrays;
public static int[] findThreeLargestNumbers(int[] array){ // O(n*n)?
  int[] to_return = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE,};
  for(int i = 0; i < array.length; i++){
    int k = 2;
    while(k>=0){
      if(to_return[k] == 0){
        to_return[k]=array[i];
        break;
      }
      else if(array[i] >= to_return[k]){
        shift(to_return, array[i], k);
        break;
      }
      k--;
    }
  }
  return to_return;
}

public static void shift(int[] array, int to_insert, int index){
  for(int i = 0; i < index; i++){
    array[i] = array[i+1];
  }
  array[index] = to_insert;
}
