class Solution {
    public int getDecimalValue(ListNode head) {
        int value=0;
        while(head!=null){
            value=value*2+head.val;
            head=head.next;
        }
       return value; 
    }
}