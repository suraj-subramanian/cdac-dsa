package com.surajsbmn.dsa;


// Binary tree traversals using pre-order,post-order and in-order
public class BinaryTreeTraversal {
    private static class Node {
        int item;
        Node left, right;

        public Node(int key) {
            item = key;
            left = right = null;
        }
    }

    private static class Tree {
        // root of Tree
        Node root;

        Tree() {
            root = null;
        }

        // in-order traversal
        void inOrder(Node node) {
            if (node == null)
                return;
            // traverse the left child
            inOrder(node.left);
            // traverse the root node
            System.out.print(node.item + " ");
            // traverse the right child
            inOrder(node.right);
        }

        // pre-order traversal
        void preOrder(Node node) {
            if (node == null)
                return;

            // traverse the root node
            System.out.print(node.item + " ");
            // traverse the left child
            preOrder(node.left);
            // traverse the right child
            preOrder(node.right);
        }

        // post-order traversal
        void postOrder(Node node) {
            if (node == null)
                return;
            // traverse the left child
            postOrder(node.left);
            // traverse the right child
            postOrder(node.right);
            // traverse the root node
            System.out.print(node.item + " ");
        }


        public static void main(String[] args) {

            // create an object of Tree
            Tree tree = new Tree();
            /*
                1
               / \
              12  9
             /  \
            5    6
             */
            // create nodes of tree
            tree.root = new Node(1);
            tree.root.left = new Node(12);
            tree.root.right = new Node(9);
            // create child nodes of left child
            tree.root.left.left = new Node(5);
            tree.root.left.right = new Node(6);


            System.out.println("In Order traversal");
            tree.inOrder(tree.root);
            System.out.print("\n");
            System.out.println("Pre Order traversal");
            tree.preOrder(tree.root);
            System.out.print("\n");
            System.out.println("Post Order traversal");
            tree.postOrder(tree.root);
        }
    }
}
