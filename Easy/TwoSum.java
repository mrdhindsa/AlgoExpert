// Two-Sum : Find 2 values in an array that sum up to a TargetValue. Idea: Use complements, O(n) time
public static int[] twoNumberSum(int[] array, int targetSum){
  ArrayList<Integer> a_list = new ArrayList<Integer>();
  for(int i = 0; i < array.length; i++){
    int curr = array[i];
    if(a_list.contains(targetSum-curr)){
      if(targetSum-curr > curr) return new int[]{curr, targetSum-curr};
      else{ return new int[]{targetSum-curr,curr}; }
    } 
    a_list.add(curr);
  }
  return new int[]{};
}
