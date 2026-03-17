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

    private ListNode merge(ListNode l1, ListNode l2, ListNode res){
        if (l1 == null && l2 == null)
            return null;
        
        if (l1 == null){
            res.next = l2;
            return res.next;
        }
            
        if (l2 == null){
            res.next = l1;
            return res.next;
        }

        //System.out.println(res.val + " (res): "+ l1.val + " : "+ l2.val + " : com: " + (l1.val <= l2.val));
        if (l1.val <= l2.val){
            ListNode node = new ListNode(l1.val);
            res.next = node;

            merge(l1.next, l2, res.next);
        }
        else {
            ListNode node = new ListNode(l2.val);
            res.next = node;
            merge(l1, l2.next, res.next);
        }

        return res.next;
    }
}