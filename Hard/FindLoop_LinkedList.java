// Given a Single Linked List which only knows this.value and this.next, find the loop.
// INPUT WILL ALWAYS HAVE A LOOP
public static LinkedList brute_findLoop(LinkedList head){ // Uses O(n) time and O(n) space (38ms runtime)
  ArrayList<LinkedList> arr = new ArrayList<LinkedList>();
  LinkedList temp = head;
  while(temp.next != null){
    if(arr.contains(temp)){
      return temp;
    }
    arr.add(temp);
    temp = temp.next;
  }
  return head; // Unreachable
}

// Without Using extra space. O(1) space complexity
