import java.util.ArrayList;

class Program {
   static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
  
  public static void iterative_removeKthNodeFromEnd(LinkedList head, int k) { // Using one pointer (traversing the list twice) // O(2n) = O(n) \\
    LinkedList temp = head, new_temp;
    int count = 0;
    while(temp != null){
      temp = temp.next;
      count++;
    }
    if(count == k){ // Must remove head. Why doesnt head = head.next; work?
      head.value = head.next.value; 
      head.next = head.next.next;
      return;
    }
    temp = head;
    for(int i = 0; i + 1 + k < count; i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
  }
   
  public static void removeKthNodeFromEnd(LinkedList head, int k) { // Using two pointers. O(n) time and O(1) constant space
	 LinkedList slow = head, fast = head;
	 for(int i = 0; i < k; i++){
		fast = fast.next;
	 }
	 if(fast == null){
		head.value = head.next.value;
		head.next = head.next.next;
		return;
	 }
	 while(fast.next != null){
		fast = fast.next;
		slow = slow.next;
	 }
	 slow.next = slow.next.next;
  }
}
