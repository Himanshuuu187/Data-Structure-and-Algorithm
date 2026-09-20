package Trees.BinaryTrees;
/* 
import java.util.Scanner;


public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }

    private void display(Node node,String indent){
        if(node == null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettydisplay(){
        prettydisplay(root,0);
    }

    private void prettydisplay(Node node,int level){
        if(node == null){
            return;
        }

        prettydisplay(node.right, level + 1);

        if(level!=0){
            for(int i = 0;i<level - 1;i++){
                System.out.println("|\t\t");
            }

            System.out.println("|-------> " + node.value);
        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left, level+1);
    }

}

*/

import java.util.Scanner;

public class BinaryTree(){

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;


        public Node(int value){
            this.value = value;

        }

    }

    private Node root;

    public void Insert(Scanner Scanner,Node node) {
        System.out.println("Enter the root Node: ");
        int value = Scanner.nextInt();
        root = new Node(value);
        Insert(Scanner, value);
    }

    private void Insert(Scanner Scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = Scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the left of " + node.value);
            int value = Scanner.nextInt();
            node.left = new Node(value);
            Insert(Scanner, node.left);
        }

        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = Scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right of " + node.value);
            int value = Scanner.nextInt();
            node.right = new Node(value);
            Insert(Scanner, node.right);
        }

    }

    public void Display() {
        Display(this.root, "");

    }

    private void Display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + indent);
        Display(node.left, indent + "\t");
        Display(node.right, indent + "\t");

    }
}
