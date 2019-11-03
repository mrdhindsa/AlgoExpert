import java.util.ArrayList;

static class BST {
  public int value;
  public BST left;
  public BST right;

  public BST(int value) {
    this.value = value;
  }
}

// Using Recursion //
public static ArrayList<Integer> inOrderTraverse(BST tree, ArrayList<Integer> array) {
  if(tree == null) return array;
  inOrderTraverse(tree.left, array);
  array.add(tree.value);
  inOrderTraverse(tree.right, array);
  return array; 
}

public static ArrayList<Integer> preOrderTraverse(BST tree, ArrayList<Integer> array) {
  if(tree == null) return array;
  array.add(tree.value);
  preOrderTraverse(tree.left, array);
  preOrderTraverse(tree.right, array);
  return array; 
}

public static ArrayList<Integer> postOrderTraverse(BST tree, ArrayList<Integer> array) {
  if(tree == null) return array;
  postOrderTraverse(tree.left, array);
  postOrderTraverse(tree.right, array);
  array.add(tree.value);
  return array; 
}
