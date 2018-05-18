package com.compan;

import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
//        //STACK - last in first out
//        // push, pop, peek, isEmpty
//        //static and dynamic
//        // static Stack implementation
//
//        StaticStack s = new StaticStack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.pop();
//        while (!s.isEmpty()) {
//            System.out.printf("%d", s.pop());
//
//        }
//        Stack<Integer> s1 = new Stack<>();
//
////        DynamicQueue q = new DynamicQueue();
////        q.enqueue(1);
////        q.enqueue(2);
////
////        q.enqueue(3);
////        q.enqueue(1);
////        while (!q.isEmpty()) {
////            System.out.printf("%d", q.peek());
////
////        }
//        System.out.println();
//        StaticQueue sQ = new StaticQueue();
//        sQ.enqueue(1);
//        sQ.enqueue(2);
//        sQ.enqueue(3);
//        sQ.dequeue();
//
//        sQ.enqueue(4);
//        sQ.enqueue(1);
//        while (!sQ.isEmpty()) {
//            System.out.printf("%d", sQ.dequeue());
//        }
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(5);

        Solution3.print(Solution3.rotateRight(head, 2));

    }
    static class  Solution3 {
        public static ListNode rotateRight(ListNode head, int k) {
            ListNode node;
            ListNode head2 = head;
            int index = 0;
            while (head!=null){
                    if (head.next == null) {
                        node = new ListNode(head.val);
                        index++;
                    } else if (head.next.val == node.val) {
                        node.next = new ListNode(head.next.val);
                        node = node.next;
                        index++;
                        head= head.next;
                    }

            }
        }

        public static void print (ListNode list){
            while (list != null) {
                System.out.println(list.val);
                list = list.next;
            }
        }
    }

//    static class Solution {
//        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//            ListNode result = new ListNode(-1);
//            ListNode node = result;
//            while (l1 != null && l2 != null) {
//                if (l1.val < l2.val) {
//                    node.next = new ListNode(l1.val);
//                    l1 = l1.next;
//                } else {
//                    node.next = new ListNode(l2.val);
//                    l2 = l2.next;
//                }
//                node = node.next;
//            }
//            while (l2 != null) {
//                node.next = new ListNode(l2.val);
//                l2 = l2.next;
//                node = node.next;
//            }
//            while (l1 != null) {
//                node.next = new ListNode(l1.val);
//                l1 = l1.next;
//                node = node.next;
//            }
//            return result;
//        }
//
//        public static void print(ListNode x) {
//            while (x != null) {
//                System.out.println(x.val);
//                x = x.next;
//            }
//        }
//    }
//    static class Solution2 {
//        public static ListNode deleteDuplicates(ListNode head) {
//            ListNode result = new ListNode(0);
//            ListNode node = result;
////            ListNode node1 = result;
//            while(head != null){
//                if (head.next == null){
//                    node.next = new ListNode(head.val);
//                    break;
//                }
//                if (head.val == head.next.val){
//                    head = head.next;
//                    continue;
//                }
//                node.next = new ListNode(head.val);
//                node = node.next;
//                head = head.next;
//            }
//            return result.next;
//        }
//        public static void print(ListNode list){
//            while (list != null){
//                System.out.println(list.val);
//                list = list.next;
//            }
//        }
//    }


}

