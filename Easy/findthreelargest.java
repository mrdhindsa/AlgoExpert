// Method 1: Easy
public static int[] findThreeLargestNumbers(int[] array){
  Arrays.sort(array);
  int size = array.length;
  return new int[]{array[size-3],array[size-2],array[size-1]};
}

// Method 2: Not Using java.util.Arrays;
