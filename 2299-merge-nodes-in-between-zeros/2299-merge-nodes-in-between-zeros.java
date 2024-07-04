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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=head.next;
        ListNode dum=dummy;
        int data=0;
        while(temp!=null){
          if(temp.val==0){
              dum.next=new ListNode(data);
              dum=dum.next;
              //System.out.println(data);
              data=0;
          }
          else{
            data+=temp.val;
          }
          temp=temp.next;
        }
        return dummy.next;
    }
}