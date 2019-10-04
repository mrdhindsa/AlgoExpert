// Given two arrays, find the pair of numbers (1 from each) with the minimum difference. O(n) time
import java.util.*;

public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
  int min_dif = Integer.MAX_VALUE, a_one = 0, a_two = 0; 
  Arrays.sort(arrayOne);
  Arrays.sort(arrayTwo);
  int index1 = 0, index2 = 0; // pointers
  while(index1 < arrayOne.length && index2 < arrayTwo.length){
    int diff = Math.abs(arrayOne[index1] - arrayTwo[index2]);
    if(diff == 0){ // If same value found, break and save time
      a_one = index1;
      a_two = index2;
      break;
    }
    if(diff < min_dif){
      min_dif = diff;
      a_one = index1;
      a_two = index2;
    }
    if(arrayOne[index1] < arrayTwo[index2]) index1++;
    else{ index2++; }
  }
  return new int[]{arrayOne[a_one],arrayTwo[a_two]};
}
