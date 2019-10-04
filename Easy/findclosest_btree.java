// Find the closest value to target in a Binary Tree. Avg case O(lgn), Worst case O(n)
import java.lang.Math.*;
	
static class BST {
  public int value;
  public BST left;
  public BST right;

  public BST(int value) {
    this.value = value;
  }
}

public static int findClosestValueInBst(BST tree, int target){
  BST curr = tree; //Root
  int curr_difference = Integer.MAX_VALUE, closest = 0;
  while(curr != null){
    int diff = (int) Math.abs(curr.value - target);
    if(diff == 0) return target;
    else if(diff < curr_difference){
      closest = curr.value;
      curr_difference = diff;
    }
    if(target > curr.value) curr = curr.right;
    else{ curr = curr.left; }
  }
  return closest;
}
