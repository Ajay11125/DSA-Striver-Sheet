package DAY3;

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class CycleInLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode curr=head;
        ListNode slow=curr;
        ListNode fast=curr;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
