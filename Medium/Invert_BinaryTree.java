// Recall a Binary Tree is just a tree where each node has 2 children left and right (There is no constraint on values)
// A Binary Search Tree left child has smaller value and right child has value greater than or equal to
import java.util.ArrayDeque;

class Program {

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }  
  
  public static void recursive_invertBinaryTree(BinaryTree tree) { // 86 ms runtime. O(n) time, O(d) space
    if(tree == null) return;
    BinaryTree temp = tree.left;
    tree.left = tree.right;
    tree.right = temp;
    invertBinaryTree(tree.left);
    invertBinaryTree(tree.right);
  }
  
  public static void iterative_invertBinaryTree(BinaryTree tree) { // Using depth first search. 33 ms runtime. O(n) time, O(n) space
    Stack<BinaryTree> stack = new Stack<BinaryTree>(){{
      add(tree);
    }};
    while(stack.empty() == false){
      BinaryTree curr = stack.pop(), left = curr.left;
      curr.left = curr.right;
      curr.right = left;
      if(curr.left != null){
        stack.push(curr.left);
      }
      if(curr.right != null){
        stack.push(curr.right);
      }
    }
  }
}
