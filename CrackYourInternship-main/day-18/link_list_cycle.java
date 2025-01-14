public class Solution {
    public boolean hasCycle(ListNode head) {
        int count = 0;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 !=null && p2.next !=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }
        }
        return false;
    }
}