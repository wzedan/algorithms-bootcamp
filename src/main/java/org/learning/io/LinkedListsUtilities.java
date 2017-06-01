package org.learning.io;

import java.util.LinkedList;

/**
 * Created by wz on 5/8/17.
 */
public class LinkedListsUtilities {

    class Node {
        public Node next;
        public Integer digit;

        public Node(Integer digit) {
            this.digit = digit;
        }

        public void push(Node successor) {
            this.next = successor;
        }
    }

    public static void sumLists(LinkedList<String> list, Integer index) {
        LinkedListsUtilities.Node node1 = new LinkedListsUtilities().new Node(6);
        LinkedListsUtilities.Node node2 = new LinkedListsUtilities().new Node(2);
        node1.next = node2;
        LinkedListsUtilities.Node node3 = new LinkedListsUtilities().new Node(5);
        node2.next = node3;

        LinkedListsUtilities.Node nodeb1 = new LinkedListsUtilities().new Node(2);
        LinkedListsUtilities.Node nodeb2 = new LinkedListsUtilities().new Node(9);
        nodeb1.next = node2;
        LinkedListsUtilities.Node nodeb3 = new LinkedListsUtilities().new Node(5);
        nodeb2.next = node3;
    }
}
