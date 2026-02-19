package LinkedList.SingleLinkedList;

public class main{
    public static void main(String[] args) {
        LL list = new LL();

        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);
        list.InsertAtLast(10);
        list.InsertAtIndex(85, 2);

        // System.out.println(list.DeleteAtFirst());

        list.Display();
    }
}