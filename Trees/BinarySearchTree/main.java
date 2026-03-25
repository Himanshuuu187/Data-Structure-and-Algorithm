package Trees.BinarySearchTree;

public class main {
    public static void main(String[] args) {
        BST bst = new BST();

        int[] nums = {5,4,3,8,9,1,2,10,12};
        bst.populate(nums);
        bst.display();
    }
    
}
