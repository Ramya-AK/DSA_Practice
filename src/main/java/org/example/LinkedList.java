package org.example;

public class LinkedList {

    public class Node {
        int data;
        Node next;

        // everytime creating the Node, next will be null by default
       public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void add(int data) {
        //creating the new node
        Node newNode = new Node(data);

        //initially head is null and head referring to null by default
        if(head == null) {
            // head will referring to newNode
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            if(data == 10) {
                current.next.next = head.next.next.next.next;
            }
        }


    }

    public void firstAdd(int data) {
        Node newFirstNode = new Node(data);
        Node current = head;
        newFirstNode.next = current;
        head = newFirstNode;
    }

    public void deleteElement(int data) {
        Node current =  head;

        if(current.data == data) {
            head = current.next;
            return;
        }
        while(current.next!= null && current.next.data != data) {
            current = current.next;
        }
        if(current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printValue() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public Node reverseIteration() {
        Node current = head;

        Node prev = null;

        while(current !=null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public Node reverseRecursiveHelper() {
        return  reverseRecursive(head);
    }

    public Node reverseRecursive(Node head) {
        Node current = head;
        if(current == null || current.next == null) {
            return current;
        }

        Node reversedHead = reverseRecursive(current.next);

        current.next.next = current;

        // null should add, otherwise loop with circular loop happen, simple words 4 next will connect to 3 and 3 next will 4 (if null is not add)
        current.next = null;

        return reversedHead;

    }


    public boolean cycleDetection() {
        Node current = head;
        boolean hasCycle = false;

        if(current == null || current.next == null) {
            return hasCycle;
        }

        Node slow = head;
        Node fast = head;


        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                hasCycle = true;

                System.out.println("come");
                return  hasCycle;
            }
        }
        return  hasCycle;
    }

    


}
