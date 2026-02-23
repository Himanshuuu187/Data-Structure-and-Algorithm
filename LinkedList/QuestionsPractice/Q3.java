
//           Merge Two Sorted List[LeetCode no 21]

package LinkedList.QuestionsPractice;

public class Q3 {
    private Node head;
    private Node tail;
    private int size;

    public Q3() {
        this.size = 0;
    }

    public void InsertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void InsertAtLast(int value) {
        if (tail == null) {
            InsertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public static Q3 merge(Q3 first,Q3 second){
        Node f = first.head;
        Node s = second.head;
        Q3 ans = new Q3();

        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.InsertAtLast(f.value);
                f = f.next;

            }else{
                ans.InsertAtLast(s.value);
                s = s.next;
            }
        }

        while(f!=null){
            ans.InsertAtLast(f.value);
            f = f.next;
        }

        while(s!=null){
            ans.InsertAtLast(s.value);
            s = s.next;
        }

        return ans;

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
