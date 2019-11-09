// Given an array find the max sum of adjacent numbers

// Use [3,-2,4] to think about it
// temp is checking should I continue a count or reset it
// curr_max is the actual max check
  public static int kadanesAlgorithm(int[] array){ // O(n) time and space
    int temp = array[0];
    int curr_max = array[0];
    for(int i = 1; i < array.length; i++){
      temp = Math.max(temp + array[i], array[i]);
      curr_max = Math.max(curr_max, temp);
    }
    return curr_max;
  }
