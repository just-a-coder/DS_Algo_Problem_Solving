package com.problemsolving.leetcode.linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.insertAtEnd(5);
        listNode.insertAtEnd(2);
        listNode.insertAtEnd(2);
        listNode.printSL();

        LinkedListOperation linkedListOperation = new LinkedListOperation();
        System.out.println("MiddleNode: "+linkedListOperation.middleNode(listNode).val);
        listNode.next = linkedListOperation.removeElements(listNode.next,2);
        listNode.printSL();
    }
}
