public static LinkedList reverseLinkedList(LinkedList head) { // O(n) time O(1) space 
  LinkedList prev = null, curr = head;
  while(curr != null){
    LinkedList temp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = temp;
  }
  return prev;
}

static class LinkedList {
  int value;
  LinkedList next = null;

  public LinkedList(int value) {
    this.value = value;
  }
}
