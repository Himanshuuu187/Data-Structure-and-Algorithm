
//          92. Reverse Linked List II

package LinkedList.QuestionsPractice;

public class Q12 {
    private Node head;
    private Node tail;
    private int size;

    public Q12() {
        this.size = 0;
    }

    public Node ReverseBetween(Node head,int left,int right){
        if(left == right){
            return head;

        }

        Node current = head;
        Node prev = null;
        for(int i = 0;current!=null && i<left - 1;i++){
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node next = current.next;

        for(int i = 0;current!=null && i<right - left + 1;i++){
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
