// Given a 2D matrix, each row is sorted, each column is sorted. 
// Find a value in matrix, return its row and column indices.

public static int[] brute_searchInSortedMatrix(int[][] matrix, int target) { // O(n*n) /*BRUTE*/
  for(int i = 0; i < matrix.length; i++){
    for(int j = 0; j < matrix[0].length; j++){
      if(matrix[i][j] == target) return new int[]{i,j};
    }
  }
  return new int[]{-1,-1};
}

public static int[] optimized_searchInSortedMatrix(int[][] matrix, int target) { // Better Way 
  int row = 0, col = matrix[0].length - 1;
  while(row < matrix.length && col >= 0){
    int val = matrix[row][col];
    if(val == target) return new int[]{row, col};
    if(val > target) col--;
    else{ row++; }
  }
  return new int[]{-1,-1};
}
