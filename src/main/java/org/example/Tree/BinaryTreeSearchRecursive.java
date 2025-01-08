package org.example.Tree;

public class BinaryTreeSearchRecursive {


    // Node each node called as Node
    // Root which does not have parent
    // Edge which is the line connect parent to child
    // Leaf which does not have any child
    // Depth how many node to travel to reach
    // The node which has MAX two child called as Binary Tree

    public class Node {

        int data;
        Node right;
        Node left;


        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    Node root = null;
    Node current = null;

    public void insertNode(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node root, int data) {
        if(root == null) {
            root = new Node(data);
        } else if(data < root.data) {
            //imp
            // left value should be a Node so create a Node, should not add the data since it is a Node
            // for 3rd data,root should shift to 1st to 2nd. becz for 3rd data, 2nd is the root
            root.left = insertRecursive(root.left, data);

        } else if(data > root.data) {
            root.right = insertRecursive(root.right, data);
        }
        //imp
        // final function call in the recursive stake will return the initial root
        return root;
    }

    public void displayInOrder() {
        System.out.println("tree In order recursive");
        displayInOrderRecursive(root);
    }

    public void displayInOrderRecursive(Node root) {
        if(root != null) {
            // it will go to the end left and display data and go to the end right node and again their left so on
            // remember
            displayInOrderRecursive(root.left);
            System.out.print(root.data + " ");
            displayInOrderRecursive(root.right);
        }
    }

    public void displayPreOrder() {
        System.out.println("tree pre order recursive");
        displayInPreRecursive(root);
    }

    public void displayInPreRecursive(Node root) {
        if(root != null) {
            // it will display the root first and next left display data and go to the right node and again their left so on
            // remember
            System.out.print(root.data + " ");
            displayInPreRecursive(root.left);
            displayInPreRecursive(root.right);
        }
    }

    public void displayPostOrder() {
        System.out.println("tree pre order recursive");
        displayInPostRecursive(root);
    }


    public void displayInPostRecursive(Node root) {
        if(root != null) {
            // it will display the root first and next left display data and go to the right node and again their left so on
            // remember
            System.out.print(root.data + " ");
            displayInPostRecursive(root.left);
            displayInPostRecursive(root.right);
        }
    }

    public Void searchData(int data) {
        Node current  = root;


        if(root == null) {
            System.out.println("No data found");
        }

       while (current != null) {
           if(data == current.data) {
               System.out.println("data found" + data);
               return null;
           }

           if(data < current.data) {
               current =  current.left;
           } else {
               current = current.right;
           }
       }

        System.out.println("No data found");
       return null;
    }

    public void searchDataRecursiveMethod(int data) {
        searchDataRecursive(root, data);
    }

    public Node searchDataRecursive(Node root, int data) {
        Node current =  root;
        if(current == null) {
            System.out.println("data not found");
            return current;
        }
        if(current.data == data) {
            System.out.println("data found");
            return current;
        }

        if(data < current.data) {
            return searchDataRecursive(current.left, data);
        } else {
            return searchDataRecursive(current.right, data);
        }
    }
}


// tree =>
// two functions to create a node and display
// recursive
// root node should not change the value
// left and right
// everytime starts from root
// root should be return from the recursive


//           5
//         /   \
//         3     7
//         /     /  \
//         1     6    9
//         / \       /
//         0   2     8
//         /        /
//         -1      4

//InOrder: Left -> Root -> Right
//PreOrder (Root → Left → Right):
//Output: 5 3 1 0 -1 2 7 6 9 8 4
//PostOrder (Left → Right → Root): Output: -1 0 2 1 3 6 4 8 9 7 5
