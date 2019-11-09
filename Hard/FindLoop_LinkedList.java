// Given a Single Linked List which only knows this.value and this.next, find the loop.
// INPUT WILL ALWAYS HAVE A LOOP
public static LinkedList brute_findLoop(LinkedList head){ // Uses O(n) time and O(n) space (38ms runtime)
  HashSet<LinkedList> hash = new HashSet<LinkedList>();
  LinkedList curr = head;
  while(curr != null){
    if(hash.contains(curr))
      break;
    hash.add(curr);
    curr = curr.next;
  }
  return curr; // if break happened (this is the loop node), if while loop broke (curr == null) null will be returned -> there is no loop
}
