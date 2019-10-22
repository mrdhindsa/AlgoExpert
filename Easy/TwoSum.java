// Two-Sum : Find 2 values in an array that sum up to a TargetValue. Idea: Use complements, O(n) time and O(n) space
public static int[] twoNumberSum(int[] array, int targetSum){
  ArrayList<Integer> a_list = new ArrayList<Integer>();
  for(int i = 0; i < array.length; i++){
    int curr = array[i];
    if(a_list.contains(targetSum-curr) && targetSum-curr > curr) return new int[]{curr, targetSum-curr};
    else if(a_list.contains(targetSum-curr) && targetSum-curr <= curr) return new int[]{targetSum-curr,curr};
    a_list.add(curr);
  }
  return new int[]{};
}

// Alternative Method: Use 2 pointers (array must be sorted). O(n/2) time and O(1) constant space
public static int[] twoNumberSum(int[] array, int targetSum){
  Arrays.sort(array);
  int left = 0, right = array.length - 1;
  while(left < right){
    int curr_sum = array[left] + array[right];
    if(curr_sum == targetSum) return new int[]{array[left], array[right]};
    else if(curr_sum > targetSum) right--;
    else{ left++; }
  }
  return new int[]{};
}
