package com.problemsolving.leetcode.linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //Append Node in Singly Linked List
    int insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (next == null) {
            next = newNode;
            return next.val;
        } else {
            ListNode node = next;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        return newNode.val;
    }


    // Print Singly Linked List
    void printSL() {
        if (next == null)
            return;
        ListNode node = next;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
}
