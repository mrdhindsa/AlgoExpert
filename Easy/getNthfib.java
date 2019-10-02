//  Return the nth fibonnaci number
public static int getNthFib(int n){
  if(n == 1 || n == 2) return n - 1;
  int curr = 0, curr_1 = 1, curr_2 = 0;
  while(n > 2){
    curr = curr_1 + curr_2;
    curr_2 = curr_1;
    curr_1 = curr;
    n--;
  }
  return curr;
}
