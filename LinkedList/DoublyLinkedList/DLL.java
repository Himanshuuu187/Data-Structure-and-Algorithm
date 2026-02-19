package LinkedList.DoublyLinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }




    public void InsertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        while(head!=null){
            head.prev = node;
        }

        head = node;
    }


    public void displayFromFront(){
        Node node = head;

        while(node!=null){
            System.out.print(node.value + "-> ");
            node = node.next;
        }

        System.out.println("NULL");
    }


    public void DisplayFromReverse(){
        Node node = head;
        Node last = null;

        while(node!=null){
            last = node;
        }

        while(last!=null){
            System.out.print(last.value + "->");
            last = last.prev;
        }

        System.out.println("NULL");
    }

    public void InsertAtLast(int value){
        Node node = new Node(value);
        node.next = null;
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next!=null){
            last = last.next;
        }

        last.next = null;
        node.prev = last;
    }


    public Node find(int value){
        Node node = head;

        while(head!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void InsertAfterNode(int after,int value){
        Node p = find(after);

        if(p == null){
            System.out.println("Doesn't Exists");
            return;

        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.next!=null){
            node.next.prev = node;
        }
    }

    private class Node{
        private Node prev;
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node prev,Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }
    
}
