// Bubble Sort: Traverse array and swap adjacent elements. Repeat until no strides can be performed. Space is O(1) and time is avg O(n*n) best O(n) 
public static void swap(int[] array, int i, int index){
  int temp = array[i];
  array[i] = array[index];
  array[index] = temp;
}

public static int[] bubbleSort(int[] array){
  boolean swap;
  do{
    swap = false;
    for(int i = 0; i < array.length - 1; i++){
      if(array[i+1]<array[i]){
        swap(array,i+1,i);
        swap = true;
      }
    }
  } while(swap);
  return array;
}
