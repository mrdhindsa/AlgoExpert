// array[i] is the jump. Starting at k, make sure all other indices are visited once before returning to k.
  public static boolean hasSingleCycle(int[] array){ // O(n*n) time and O(n) space
    ArrayList<Integer> check = new ArrayList<Integer>();
    for(int i = 0; i < array.length; i++){
      int start_index = i, k = 0;
      while(k < array.length){
	int new_index = start_index + array[start_index];
	while(new_index < 0 || new_index >= array.length){
	  new_index = (new_index < 0) ? new_index + array.length : new_index;
	  new_index = (new_index >= array.length) ? new_index - array.length : new_index;
	}
	if(check.contains(new_index) == false) check.add(new_index);
	start_index = new_index;
        k++;
      }
      if(check.size() == array.length) return true;
      check.clear();
    }
    return false;
  }
