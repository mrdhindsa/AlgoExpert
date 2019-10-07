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
  
  public static void recursive_invertBinaryTree(BinaryTree tree) { // 86 ms runtime
    if(tree == null) return;
    BinaryTree temp = tree.left;
    tree.left = tree.right;
    tree.right = temp;
    invertBinaryTree(tree.left);
    invertBinaryTree(tree.right);
  }
}
