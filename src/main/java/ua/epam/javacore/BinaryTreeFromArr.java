package ua.epam.javacore;

public class BinaryTreeFromArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node n = new Node();
        Node b = createTree(arr,n,0);
        printTree(b);
    }

    private Node root;

     static class Node {
        int data;
        Node left;
        Node right;

         public Node() {
         }

         public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createTree(int[] arr, Node node, int num) {
        if (num < arr.length) {
            node = new Node(arr[num]);
            node.left = createTree(arr, node.left, 2 * num + 1);
            node.right = createTree(arr, node.right, 2 * num + 2);
        }
        return node;
    }

    public static void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.data + " ");
            printTree(node.right);
        }
    }


}
