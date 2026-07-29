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
    private ListNode groupkth(ListNode groupPrev,int k){
        int cnt=0;
        while(cnt<k && groupPrev!=null){
            groupPrev=groupPrev.next;
            cnt++;
        }

        return groupPrev;
    }
   
    public ListNode reverseKGroup(ListNode head, int k) {

       ListNode dummy=new ListNode(0);

       dummy.next=head;

       ListNode groupPrev=dummy;

       while(true)
       {
            ListNode kth=groupkth(groupPrev,k);

            if(kth==null){
                break;
            }

            ListNode groupNext=kth.next;

            ListNode prev=groupNext;
            ListNode curr=groupPrev.next;

            while(curr!=groupNext){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }

            ListNode oldgroupStart=groupPrev.next;
            groupPrev.next=kth;
            groupPrev=oldgroupStart;
       }
        
        return dummy.next;
    }
    
    


   
}