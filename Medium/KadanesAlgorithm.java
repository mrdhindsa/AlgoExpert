// Given an array find the max sum of adjacent numbers
  public static int kadanesAlgorithm(int[] array){ // O(n) time and space
    int temp = array[0];
		int curr_max = array[0];
		for(int i = 1; i < array.length; i++){
			temp = Math.max(temp + array[i], array[i]);
			curr_max = Math.max(curr_max, temp);
		}
		return curr_max;
  }
