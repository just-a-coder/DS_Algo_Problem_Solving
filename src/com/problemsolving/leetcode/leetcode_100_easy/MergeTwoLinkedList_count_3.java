package com.problemsolving.leetcode.leetcode_100_easy;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoLinkedList_count_3 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if(l1 != null){
            curr.next = l1;
        }

        if(l2 != null){
            curr.next = l2;
        }

        return head.next;
    }
}
