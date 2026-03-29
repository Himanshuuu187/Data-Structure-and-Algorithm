package Trees;

import Trees.AVLTrees.AVL;

public class main {
    public static void main(String[] args) {

        AVL tree = new AVL();

        for(int i = 0;i<1000;i++){
            tree.Insert(i);
        }

        System.out.println(tree.height());
        

    }
    
}
