class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet <Integer> hs = new HashSet();
        for(int val : nums){
            hs.add(val);
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (head != null) {
            if (hs.contains(head.val)) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        return dummy.next;
    }
}