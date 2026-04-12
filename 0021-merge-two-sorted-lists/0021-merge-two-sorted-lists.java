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
        ListNode l3 = new ListNode();

        return merge(list1, list2, l3);
    }

    private ListNode merge(ListNode l1, ListNode l2, ListNode l3){
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null){
            l3.next = l2;
            return l3.next;
        }
        if (l2 == null){
            l3.next = l1;
            return l3.next;
        }

        if (l1.val <= l2.val){
            ListNode node = new ListNode(l1.val);
            l3.next = node;
            merge(l1.next, l2, l3.next);
        }
        else {
            ListNode node = new ListNode(l2.val);
            l3.next = node;
            merge(l1, l2.next, l3.next);
        }

        return l3.next;
    }
}