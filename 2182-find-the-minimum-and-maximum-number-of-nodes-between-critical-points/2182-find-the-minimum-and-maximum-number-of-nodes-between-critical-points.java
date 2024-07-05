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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      List<Integer>list=new ArrayList<>();
      ListNode temp=head.next;
      ListNode pre=head;
      int cur=2;
      while(temp!=null && temp.next!=null){
        
        if( temp.next!=null && temp.val>pre.val && temp.val>temp.next.val){
          list.add(cur);
        }
        else if(temp.next!=null && temp.val<pre.val && temp.val<temp.next.val){
          list.add(cur);
        }
        pre=temp;
        temp=temp.next;
        cur++;
      }
      
      if(list.size()<=1)return new int[]{-1,-1};
    
     int x=list.get(list.size()-1)-list.get(0);
     int y=Integer.MAX_VALUE;
     for(int i=0;i<list.size()-1;i++){
      
        y=Math.min(y,Math.abs(list.get(i)-list.get(i+1)));
      
     }
     return new int[]{y,x};
    }
}