package Trees.AVLTrees;

public class AVL {

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

    public AVL() {

    }

    public int height(){
        return height(root);
    }

    private int height(Node node) {
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

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {

            // left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {

                // left - left case

                return RightRotate(node);

            }

            if (height(node.left.left) - height(node.left.right) < 0) {
                // left - left case

                node.left = LeftRotate(node.left);
                return RightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // Right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // Right - Right case
                return LeftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // left - left case
                node.right = RightRotate(node.right);
                return LeftRotate(node);
            }
        }

        return node;
    }

    public Node RightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public Node LeftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        c.right = t;
        p.left = c;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;
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
