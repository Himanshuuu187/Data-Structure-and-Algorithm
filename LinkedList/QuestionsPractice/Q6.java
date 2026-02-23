
//            Linked List Cycle[II]  --> Leet Code No 142

package LinkedList.QuestionsPractice;

public class Q6 {
    private Node head;
    private Node tail;
    private int size;

    public Q6() {
        this.size = 0;
    }

    public int LengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }

        }
        return 0;
    }

    public Node DetectCycle(Node head) {

        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = LengthCycle(slow);
                break;
            }

        }

        if(length == 0){
            return null;
        }

        Node f = head;
        Node s = head;
        while(length > 0){
            s = s.next;
            length --;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
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
