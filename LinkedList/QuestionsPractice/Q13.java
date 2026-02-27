
//       Palindrome Linked List [ LeetCode No 234 ]

package LinkedList.QuestionsPractice;

public class Q13 {
    private Node head;
    private Node tail;
    private int size;

    public Q13() {
        this.size = 0;
    }

    public Node MiddleNode(Node head) {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;9
            f = f.next.next;
        }
        return s;
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

    public boolean isPalindrome(Node head){
        Node mid = MiddleNode(head);
        Node HeadSecond = Reverse(mid);
        Node ReReverseHead = HeadSecond;

        while(head!=null && HeadSecond!=null){
            if(head.value !=HeadSecond.value){
                break;
            }

            head = head.next;
            HeadSecond = HeadSecond.next;
        }

        Reverse(ReReverseHead);

        if(head == null || HeadSecond == null){
            return true;
        }else{
            return false;
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
