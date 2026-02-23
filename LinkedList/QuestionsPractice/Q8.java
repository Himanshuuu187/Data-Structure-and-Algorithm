
//         Middle of the Linked List[ Leet Code no 876]

package LinkedList.QuestionsPractice;

public class Q8 {
    private Node head;
    private Node tail;
    private int size;

    public Q8() {
        this.size = 0;
    }


    public Node MiddleNode(Node head){
        Node s = head;
        Node f = head;

        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }

        return s;
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
