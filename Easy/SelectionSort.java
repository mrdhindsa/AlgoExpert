// Selection sort: find minimum element from unsorted array and place at beginnging. Constant space O(1), time is O(n*n)
public static void swap(int[] array, int i, int index){
  int temp = array[i];
  array[i] = array[index];
  array[index] = temp;
}

public static int[] selectionSort(int[] array){
  int size = array.length;
  for(int i = 0; i < size - 1; i++){
    int min = array[i], index = i;
    for(int j = i + 1; j < size; j++){
      if(array[j] < min){
        min = array[j];
        index = j;
      }
    }
    swap(array, i, index);
  }
  return array;
}
