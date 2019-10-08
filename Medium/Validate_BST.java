  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
  
  // Use an inorder traversal
  public static boolean validateBst(BST tree) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		inorder(tree, array);
		System.out.println(Arrays.toString(array.toArray()));
		for(int i = 1; i < array.size(); i++){
			if(array.get(i) < array.get(i-1)) return false;
		}
		return true;
  }
	
	public static void inorder(BST tree, ArrayList<Integer> array){
		if(tree == null) return;
		inorder(tree.left, array);
		array.add(tree.value);
		inorder(tree.right, array);
	}
  
  // No extra space implementation
