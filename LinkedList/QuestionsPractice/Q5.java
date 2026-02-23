

//                      Finding the Length of the Linked List Cycle

package LinkedList.QuestionsPractice;

public class Q5 {
    private Node head;
    private Node tail;
    private int size;




    public Q5() {
        this.size = 0;
    }


    public int LengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;

                int length = 0;

                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);

                return length;
            }

            
        }

        return 0;
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


