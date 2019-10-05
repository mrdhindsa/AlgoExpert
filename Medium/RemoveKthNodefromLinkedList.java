import java.util.ArrayList;

class Program {
   static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
  
  public static void removeKthNodeFromEnd(LinkedList head, int k) { // Using one pointer (traversing the list twice) // O(n) \\
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
}
