package com.problemsolving.leetcode.linkedlist;

import java.util.HashMap;

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
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    /**
     * Given a linked list, determine if it has a cycle in it.
     */
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    /**
     * Remove all elements from a linked list of integers that have value val.
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode ptr = head;
        while (head != null && ptr.val == val) {
            head = ptr.next;
            ptr = ptr.next;
        }
        if (head == null)
            return head;
        while (ptr.next != null) {
            if (ptr.next.val == val)
                ptr.next = ptr.next.next;
            else
                ptr = ptr.next;
        }
        return head;
    }

    /**
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * As List1/List2 both traverse same distance after completing others as well.
     * If there is intersection, and length are same then they will meet on first traversal.
     * If there is intersection but length is different then they will meet at second traversal.
     * If there is no intersection point then both the list will be null after completing both round at the
     * same time.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        if(nodeA == null || nodeB == null) return null;
        while (true) {
            if(nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            if(nodeA == null && nodeB == null) return null;
            if (nodeA == null) {
                nodeA = headB;
            }
            if (nodeB == null) {
                nodeB = headA;
            }
        }
    }
}
