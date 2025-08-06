/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //if head is null or next element to head is null it will from cycle.
        if(head==null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        //loop until head is not null and head.next is not null.
        while(fast != null && fast.next != null){
            //move slow by one node
            slow = slow.next;
            //move the fast by two nodes
            fast = fast.next.next;
            //when slow and fast value is equal then return true
            //3->2->0->-4->2
            //slow = 3 ,fast = 0
            //slow = 2 ,fast=2
            // then return true.
            if(slow==fast) return true;
        }
        //when cycle not found .
        return false;
    }
}