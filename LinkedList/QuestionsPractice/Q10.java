
//                           Reversing the Linked List [ with Recursion ]

package LinkedList.QuestionsPractice;

public class Q10 {
    private Node head;
    private Node tail;
    private int size;

    public Q10() {
        this.size = 0;
    }

    private void Reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        Reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

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
