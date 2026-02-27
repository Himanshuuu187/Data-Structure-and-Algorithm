
//          Reverse Nodes in K Group [ LeetCode No 25 ]

package LinkedList.QuestionsPractice;

public class Q15 {
    private Node head;
    private Node tail;
    private int size;

    public Q15() {
        this.size = 0;
    }


    public Node ReverseKGroup(Node head, int k){
        if(k<=1 || head == null){
            return head;
        } 

        Node current = head;
        Node prev = null;

        while(true){
            Node last = prev;
            Node newEnd = current;
            Node next = current.next;

            for(int i = 0;current!=null && i<k;i++){
                current.next = prev;
                prev = current;
                current = next;

                if(next!=null){
                    next = next.next;
                }
            }

            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;

            if(current == null){
                break;
            }

            prev = newEnd;
        }

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