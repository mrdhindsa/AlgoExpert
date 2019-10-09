public static int maxSubsetSumNoAdjacent(int[] array){ // O(n) time and space 
  if(array.length == 0) return 0;
  else if(array.length == 1) return array[0];
  int[] max = array.clone();
  max[1] = Math.max(array[0], array[1]);
  for(int i = 2; i < array.length; i++){
    max[i] = (max[i-2] + array[i] > max[i-1]) ? max[i-2] + array[i] : max[i-1];
  }
  return max[array.length-1];
}
