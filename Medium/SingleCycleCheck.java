  public static boolean hasSingleCycle(int[] array){ // O(n*n) time and O(n) space
		int[] check = new int[array.length];
		for(int i = 0; i < array.length; i++){
			int start_index = i, k = 0;
			while(k < array.length){
				int new_index = start_index + array[start_index];
				while(new_index < 0 || new_index >= array.length){
					new_index = (new_index < 0) ? new_index + array.length : new_index;
					new_index = (new_index >= array.length) ? new_index - array.length : new_index;
				}
				check[new_index]++;
				start_index = new_index;
				k++;
			}
			int count = 0;
			for(k = 0; k < check.length; k++){
				if(check[k] == 1) count++;
			}
			if(count == check.length) return true;
			Arrays.fill(check,0);
		}
		return false;
  }
