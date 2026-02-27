
//                                  Rotate List [ LeetCode No 61 ]

package LinkedList.QuestionsPractice;

public class Q17 {
    private Node head;
    private Node tail;
    private int size;

    public Q17() {
        this.size = 0;
    }

    public Node RotateRight(Node head,int k){
        if(k<=0 || head == null || head.next == null){
            return head;
        }

        Node last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length ++;

        }

        last.next = head;

        int rotations = k%length;
        int skip = length - rotations;
        Node NewLast = head;

        for(int i = 0;i<skip - 1;i++){
            NewLast = NewLast.next;
        }

        head = NewLast.next;
        NewLast.next = null;

        return head;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
