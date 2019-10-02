// Insertion Sort: Stride and swipe neigbhoring indices
public static void swap(int[] array, int i, int index){
  int temp = array[i];
  array[i] = array[index];
  array[index] = temp;
}

public static int[] insertionSort(int[] array){
  int size = array.length;
  for(int i = 1; i < size; i++){
    int j = i - 1, value = array[i];
    while(j >= 0 && value < array[j]){
      swap(array, j, j + 1);
      j--;
    }
  }
  return array;
}
