package Trees.BinarySearchTree;

class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;

        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void Insert(int value) {

        root = Insert(value, root);

    }

    private Node Insert(int value, Node node) {

        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {

            node.left = Insert(value, node.left);

        }
        if (value > node.value) {
            node.right = Insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.Insert(nums[i]);

        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        this.Insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());
        display(node.left, "Left Child of " + node.getValue() + " : ");
        display(node.right, "right Child of " + node.getValue() + " : ");

    }

    public void PreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder() {
        InOrder(root);
    }

    private void InOrder(Node node) {
        if (node == null) {
            return;
        }

        InOrder(node.left);
        System.out.println(node.value + " ");
        InOrder(node.right);
    }

    public void PostOrder() {
        PostOrder(root);
    }

    private void PostOrder(Node node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        
        PostOrder(node.right);
        System.out.println(node.value + " ");
    }
}