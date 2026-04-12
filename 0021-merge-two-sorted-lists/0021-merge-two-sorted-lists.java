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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1_head = list1;
        ListNode l2_head = list2;
        ListNode l3 = new ListNode();
        ListNode head = l3;
        while (l1_head != null && l2_head != null){
            if (l1_head.val <= l2_head.val){
                l3.next = l1_head;
                l1_head = l1_head.next;
            }
            else{
                l3.next = l2_head;
                l2_head = l2_head.next;
            }
            l3 = l3.next;
        }
        if (l1_head != null){
            l3.next = l1_head;
        }
        if (l2_head != null){
            l3.next = l2_head;
        }
        return head.next;
    }
}