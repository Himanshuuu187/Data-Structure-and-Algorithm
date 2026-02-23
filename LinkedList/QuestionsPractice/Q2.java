
//            Remove Duplicates from Sorted List[Leet Code No 83]


package LinkedList.QuestionsPractice;

public class Q2 {
    private Node head;
    private Node tail;
    private int size;

    public Q2(){
        this.size = 0;
    }

    public void RemoveDuplicates(){
        Node node = head;

        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

}
