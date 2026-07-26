/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    HashMap<Node,Node> hash=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        if(hash.containsKey(head))return hash.get(head);

        Node copy =new Node(head.val);

        hash.put(head,copy);
        copy.next=copyRandomList(head.next);
        copy.random=hash.get(head.random);

        return copy;




        

        

    }
}