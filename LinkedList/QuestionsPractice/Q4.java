
//                  Linked List Cycle[Leet Code No 141]

package LinkedList.QuestionsPractice;


public class Q4 {
    private Node head;
    private Node tail;
    private int size;


    public Q4() {
        this.size = 0;
    }

    public boolean HasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
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

 
