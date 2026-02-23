//                           Reversing the Linked List [ without Recursion ]

package LinkedList.QuestionsPractice;

public class Q11 {
    private Node head;
    private Node tail;
    private int size;

    public Q11() {
        this.size = 0;
    }


    public void Reverse(){
        if(size<2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;

            if(next!=null){
                next = next.next;
            }
        }

        head = prev;
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
