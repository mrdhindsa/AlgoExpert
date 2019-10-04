// Given different currencies(denoms) how many ways to make change for target value n. DYNAMIC PROGRAMMING
// O(nd) time, O(n) space

public static int numberOfWaysToMakeChange(int n, int[] denoms) {
  // Write your code here.
  int[] ways = new int[n+1];
  ways[0] = 1;
  for(int denom : denoms){
    for(int i = 0; i < ways.length; i++){
      if(denom <= i){
        ways[i] += ways[i-denom];
      }
    }
  }
  return ways[n];
}
