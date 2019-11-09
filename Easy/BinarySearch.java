// O(logn) \\ Iterative binary search. returns the index of the number (if found)
public static int binarySearch(int[] array, int target) {
  int left = 0, right = array.length - 1;
  while(left <= right){
    int middle = (left + right) / 2, value = array[middle];
    if(value == target) return middle;
    else if(value > target){
      right = middle - 1;
    }	
    else{
      left = middle + 1;
    }
  }
  return -1;
}
