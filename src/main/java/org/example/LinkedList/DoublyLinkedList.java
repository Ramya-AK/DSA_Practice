package org.example.LinkedList;

public class DoublyLinkedList {

    static Node head = null;

    static class Node {
        int data;
        Node next;
        Node prev;


        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {

        addData(5);
        addData(10);
        display();
    }

    static void addData(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next !=null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

}
