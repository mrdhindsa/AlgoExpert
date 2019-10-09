public static int maxSubsetSumNoAdjacent(int[] array){ // O(n) time and O(n) space 
  if(array.length == 0) return 0;
  else if(array.length == 1) return array[0];
  int[] max = array.clone();
  max[1] = Math.max(array[0], array[1]);
  for(int i = 2; i < array.length; i++){
    max[i] = (max[i-2] + array[i] > max[i-1]) ? max[i-2] + array[i] : max[i-1];
  }
  return max[array.length-1];
}

public static int maxSubsetSumNoAdjacent(int[] array){ // O(n) time and O(1) space
  if(array.length == 0) return 0;
  else if(array.length == 1) return array[0];
  array[1] = Math.max(array[0], array[1]);
  for(int i = 2; i < array.length; i++){
    array[i] = (array[i-2] + array[i] > array[i-1]) ? array[i-2] + array[i] : array[i-1];
  }
  return array[array.length-1];
}
