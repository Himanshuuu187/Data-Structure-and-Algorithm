package Trees.SegmentTree;

class SegmentTree{

    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);

    }

    private static class Node{
        int data;
        int StartInterval;
        int EndInterval;
        Node left;
        Node right;


        public Node(int StartInterval,int EndInterval){
            this.StartInterval = StartInterval;
            this.EndInterval = EndInterval;

        }
    }

    Node root;

    public SegmentTree(int[] arr){
        this.root = ConstructTree(arr,0,arr.length - 1);

    }

    private Node ConstructTree(int[] arr,int start,int end){
        if(start == end){

            // LEAF NODE
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start + end)/2;

        node.left = this.ConstructTree(arr, start, mid);
        node.right = this.ConstructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }


}