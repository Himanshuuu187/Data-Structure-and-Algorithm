package LinkedList.CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;

    }

    public void Insert(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;

        while(head!=null){
            do{
                System.out.print(node.value);
                node = node.next;
            }while(node!=head);
        }

    }


    public void delete(int value){
        Node node = head;

        if(node ==  null){
            return;
        }

        if(node.value == value){
            head = node.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;

            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
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
