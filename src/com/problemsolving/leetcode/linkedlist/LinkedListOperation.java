package com.problemsolving.leetcode.linkedlist;

public class LinkedListOperation {

    /**
     * Given a non-empty, singly linked list with head node head,
     * return a middle node of linked list.
     * If there are two middle nodes, return the second middle node.
     */
    public ListNode middleNode(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    /**
     * Reverse a singly linked list.
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     */
    public ListNode reverseList(ListNode head) {
        ListNode prevPtr = null;
        ListNode currPtr = head;
        ListNode nextPtr = null;

        while (currPtr != null) {
            nextPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        head = prevPtr;
        return head;
    }

    /**
     * Write a function to delete a node (except the tail) in a singly linked list,
     * given only access to that node.
     */
    public void deleteNode(ListNode node) {
        ListNode prevPtr = null;
        ListNode currPtr = node;
        if(node.da)

    }

}
