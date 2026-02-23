
//                  Sorting the Linked List in the Ascending Order [ LeetCode No 148]

package LinkedList.QuestionsPractice;

public class Q9 {

    private Node head;
    private Node tail;
    private int size;

    public Q9() {
        this.size = 0;
    }

    // 🔹 MAIN SORT FUNCTION
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid and split
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
    }

    // 🔹 Find middle and BREAK list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // break the list into two halves
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }

    // 🔹 Merge two sorted linked lists
    private Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    // 🔹 Utility methods (your original style)

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
        size++;
    }

    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void sort() {
        head = sortList(head);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // 🔹 Node class
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