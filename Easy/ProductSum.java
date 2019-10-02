// Product Sum: Given an Arraylist which contains ints or other arraylists find the product sum.
// [x,[y,z]] -> x + 2y * 2z
public static int productSum(ArrayList<Object> array) {
  return getSum(array, 1);
}

public static int getSum(ArrayList<Object> array, int depth){
  int sum = 0;
  for(Object item : array){
    if(item instanceof List<?>){
      sum += (getSum((ArrayList) item, depth + 1) * depth);
    }
    else{
      sum += ((int)item * depth);
    }
  }
  return sum;
}
