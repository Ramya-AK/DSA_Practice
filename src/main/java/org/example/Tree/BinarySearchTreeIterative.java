package org.example.Tree;

public class BinarySearchTreeIterative {
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;   // Explicitly initialize to null
            this.right = null;  // Explicitly initialize to null
        }
    }

    Node root = null;

    public void addData(int data) {
        // If root is null, create new root and return
        if(root == null) {
            root = new Node(data);
            return;
        }

        Node current = root;
        while(current != null) {  // Keep looping until we find the insertion point
            if(data < current.data) {
                if(current.left == null) {
                    current.left = new Node(data);
                    return;  // Exit after insertion
                }
                current = current.left;
            } else if(data > current.data) {  // Handle the case when data is greater
                if(current.right == null) {
                    current.right = new Node(data);
                    return;  // Exit after insertion
                }
                current = current.right;
            } else {
                return;  // If equal, we don't insert (assuming no duplicates allowed)
            }
        }
    }

    // Inorder traversal (left, root, right)
    public void display() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node node) {
        if(node == null) return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
}