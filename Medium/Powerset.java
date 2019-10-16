// O(n*2^n) time and space
  public static ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> array){
		ArrayList<ArrayList<Integer>> to_return = new ArrayList<ArrayList<Integer>>();
		to_return.add(new ArrayList<Integer>());
		for(Integer val : array){
			int length = to_return.size();
			for(int i = 0; i < length; i++){
				ArrayList<Integer> temp = new ArrayList<Integer>(to_return.get(i));
				temp.add(val);
				to_return.add(temp);
			}
		}
		return to_return;
  }
  
// Idea: [1,2,3]. Begin by initalizing to_return to [[]] (a list with the empty set)
//        Loop 1: val = 1; Take the empty set, add 1 and append it to to_return -> [[],[1]]
//        Loop 2: val = 2; Take the empty set and [1], add 2 and append it to to_return -> [[],[1],[2],[1,2]]
//        Loop 3: val = 3; Take current to_return ([[],[1],[2],[1,2]]). to_return -> [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
