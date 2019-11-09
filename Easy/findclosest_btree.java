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

// Stack Implementation
public static int findClosestValueInBst(BST tree, int target) {
	Stack<BST> stack = new Stack<BST>(){{
		push(tree);
	}};
	int smallest_diff = Integer.MAX_VALUE, val = 0;
	while(!stack.empty()){
		BST curr = stack.pop();
		if(curr.value == target)
			return target;
		int diff = (int) Math.abs(curr.value - target);
		if(diff < smallest_diff){
			smallest_diff = diff;
			val = curr.value;
		}
		if(target < curr.value && curr.left != null)
			stack.push(curr.left);
		else if(target > curr.value && curr.right != null)
			stack.push(curr.right);
	}
	return val;
}
