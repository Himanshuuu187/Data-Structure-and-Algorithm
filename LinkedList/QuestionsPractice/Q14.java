
//          ReOrder List [ LeetCode No 143 ]

package LinkedList.QuestionsPractice;

import org.w3c.dom.Node;

public class Q14 {

    private Node head;
    private Node tail;
    private int size;

    public Q14() {
        this.size = 0;
    }

    private void Reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        Reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public Node MiddleNode(Node head) {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    public void ReorderList(Node head){
        if(head == null || head.next == null){
            return;
        }

        Node mid = MiddleNode(head);
        Node HS = Reverse(mid);
        Node HF = head;

        //  Rearrange

        while(HF!=null && HS!=null){
            Node temp = HF.next;
            HF.next = HS;
            HF = temp;

            temp = HS.next;
            HS.next = HF;
            HS = temp;
        }

        if(HF!=null){
            HF.next = null;
        }

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
