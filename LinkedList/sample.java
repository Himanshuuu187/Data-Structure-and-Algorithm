package LinkedList;

//                            Singly Linked List

/* 

public class sample{
    private Node head;
    private Node tail;
    private int size;

    public sample(){
        this.size = 0;
    }

    public void InsertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void InsertAtLast(int value){
        if(tail == null){
            InsertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }


    public void InsertAfterIndex(int value,int index){

        if(index == 0){
            InsertAtFirst(value);
            return;
        }

        if(index == size){
            InsertAtLast(value);
            return;
        }

        Node temp = head;

        for(int i = 0;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }

    public int DeleteAtFirst(){
        int value = head.value;

        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;

        return value;
    }

    public Node get(int index){
        Node node = head;

        for(int i = 0;i<index;i++){
            node = node.next;
        }

        return node;
    }

    public int DeleteAtLast(){
        if(size<=1){
            return DeleteAtFirst();
        }

        Node SecondLast = get(size - 2);
        int value = tail.value;
        tail = SecondLast;
        tail.next = null;

        return value;
    }

    public int DeleteAtIndex(int index){

        if(index == 0){
            return DeleteAtFirst();
        }

        if(index == size - 1){
            return DeleteAtLast();
        }

        Node node = get(size - 1);

        int value = node.next.value;
        node.next = node.next.next;

        return value;


        
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

*/


//                  Doubly Linked List


/* 
public class sample{

    private Node head;
    private Node tail;
    private int size;

    public sample(){
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
        size++;
    }






















    private class Node{
        private Node prev;
        private int value;
        private Node next;

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }


}


*/



public class sample{


    private Node head;
    private Node tail;
    private int size;


    public sample(){
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
                System.out.print(node.value + "->");

                node = node.next; 
            }while(node!=head);
        }

        System.out.println("NULL");
    }


    















    private class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.next = next;
            this.value = value;
        }

    }



}

