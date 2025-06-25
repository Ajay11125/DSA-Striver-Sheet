package DAY3;

public class ReverseLinkedLIst {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode ans=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=ans;
            ans=temp;
            temp=front;
        }
        return ans;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
