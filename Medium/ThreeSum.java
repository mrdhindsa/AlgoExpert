// Find 3 numbers that sum up to targetSum. O(n*n) time and O(n) space
import java.util.ArrayList;
import java.util.*;

public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum){
  Arrays.sort(array);
  int size = array.length;
  ArrayList<Integer[]> to_return = new ArrayList<Integer[]>();
  for(int index = 0; index < size - 2; index++){
    int val = array[index], left = index + 1, right = size - 1;
    while(left < right){
      int sum = val + array[left] + array[right];
      if(sum == targetSum){
        Integer[] arr = new Integer[]{val, array[left], array[right]};
        to_return.add(arr);
        right--;
        left++;
      }
      else if(sum > targetSum) right--;
      else{ left++; }
    }
  }
  return to_return;
}
