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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tail = head;
        int size = 1;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        int rot = k % size;
        if (rot == 0) {
            return head;
        }

        int jump = size - rot - 1;
        ListNode newTail = head;
        while (jump > 0) {
            newTail = newTail.next;
            jump--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
}