//                      Insert using Recursion in Single Linked List

package LinkedList.QuestionsPractice;

public class Q1 {

    private Node head;
    private Node tail;
    private int size;

    public Q1(){
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

    public int DeleteAtFirst() {
        int value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return value;
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

    public void InsertAtIndex(int value, int Index) {
        if (Index == 0) {
            InsertAtFirst(value);
            return;

        }
        if (Index == size) {
            InsertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < Index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int DeleteAtLast() {
        if (size <= 1) {
            return DeleteAtFirst();
        }

        Node SecondLast = get(size - 2);
        int value = tail.value;
        tail = SecondLast;
        tail.next = null;
        return value;
    }

    public void Display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.print("NULL");
    }

    public int DeleteAtIndex(int index) {
        if (index == 0) {
            return DeleteAtFirst();

        }

        if (index == size - 1) {
            return DeleteAtLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void InsertViaRec(int value, int index, Node node) {
        head = InsertRec(value, index, head);
    }

    private Node InsertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = InsertRec(value, index--, node.next);
        return node;
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
