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
    public void reorderList(ListNode head) {
        ListNode curr=head;
        List<ListNode> arr=new ArrayList<>();

        while(curr!=null){
            arr.add(curr);
            curr=curr.next;

        }

        int n=arr.size();
        int i=0;
        int j=n-1;
        while(i<j){
            arr.get(i).next=arr.get(j);
            i++;
            if(i>=j){
                break;
            }
            arr.get(j).next=arr.get(i);

            j--;

            
        }

        arr.get(i).next=null;
        
    }
}