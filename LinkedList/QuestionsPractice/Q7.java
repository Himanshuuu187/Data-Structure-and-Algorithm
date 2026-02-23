
//                                  Happy Number [ Leet Code No 202]

package LinkedList.QuestionsPractice;

public class Q7 {
    private Node head;
    private Node tail;
    private int size;

    public Q7() {
        this.size = 0;
    }

    private int FindSquare(int number) {
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;

            number = number / 10;

        }

        return ans;
    }

    public boolean IsHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = FindSquare(slow);
            fast = FindSquare(FindSquare(fast));

        } while (slow != fast);

        if (slow == 1) {
            return true;
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
