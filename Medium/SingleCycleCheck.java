// array[i] is the jump. Starting at k, make sure all other indices are visited once before returning to k.
  public static boolean hasSingleCycle(int[] array){ // O(n*n) time and O(n) space
    ArrayList<Integer> check = new ArrayList<Integer>();
    for(int i = 0; i < array.length; i++){
      int start_index = i, k = 0;
      while(k < array.length){
	int new_index = start_index + array[start_index];
	while(new_index < 0 || new_index >= array.length){ // Ensure new_index is in range
	  new_index = (new_index < 0) ? new_index + array.length : new_index;
	  new_index = (new_index >= array.length) ? new_index - array.length : new_index;
	}
	if(check.contains(new_index)) break;
	check.add(new_index);
	start_index = new_index;
        k++;
      }
      if(check.size() == array.length) return true;
      check.clear();
    }
    return false;
  }

// Better Condensed Solution. // O(n) time and O(1) space.
// My solution 1 could have been O(n) time and O(n) space. First for-loop is unnecessary (not explained well by question statement).
  public static boolean hasSingleCycle(int[] array){
    int startIndex = 0, k = 0;
    while(k < array.length){
      if(k > 0 && startIndex == 0) return false;
      startIndex = jump(startIndex, array);
      k++;
    }
    return startIndex == 0;
  }

  public static int jump(int currIndex, int[] array){
    int nextIndex = (currIndex + array[currIndex]) % array.length;
    return nextIndex >= 0 ? nextIndex : array.length + nextIndex;
  }
