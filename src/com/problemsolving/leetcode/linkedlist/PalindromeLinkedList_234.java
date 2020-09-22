package com.problemsolving.leetcode.linkedlist;

public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode firstHalfEnd = findFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        boolean palindrome = true;
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        while(palindrome && p2 != null){
            if(p1.val != p2.val)
                palindrome = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        firstHalfEnd.next = reverseList(firstHalfEnd.next);
        return palindrome;
    }

    private ListNode findFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
