// 2d array, 1 is water, 0 is land. Return the sizes of all water masses.
import java.util.*;

public static class Coordinate{
  int i, j;
  Coordinate(int x, int y){
    this.i = x;
    this.j = y;
  }
}

public static boolean inBound(int[][] matrix, int i, int j){
  return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length;
}

public static int getRiverSize(int[][] matrix, int[][] directions, int i, int j){
  Stack<Coordinate> stack = new Stack<Coordinate>();
  Coordinate start = new Coordinate(i,j);
  stack.push(start);
  int size = 1;
  while(stack.size() != 0){
    Coordinate curr = stack.pop();
    i = curr.i;
    j = curr.j;
    for(int[] direction : directions){
      int newi = i + direction[0], newj = j + direction[1];
      if(inBound(matrix, newi, newj) && matrix[newi][newj] == 1){
        size++;
        matrix[newi][newj] = 2;
        Coordinate new_coord = new Coordinate(newi, newj);
        stack.push(new_coord);
      }
    }
  }
  return size;
}

public static ArrayList<Integer> riverSizes(int[][] matrix) {
  ArrayList<Integer> sizes = new ArrayList<Integer>();
  int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
  for(int i = 0; i < matrix.length; i++) {
    for(int j = 0; j < matrix[0].length; j++) {
      if(matrix[i][j] == 1) {
        matrix[i][j] = 2;
        int size = getRiverSize(matrix, directions, i, j);
        sizes.add(size);
      }
    }
  }
  return sizes;
}
