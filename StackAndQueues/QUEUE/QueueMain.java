package StackAndQueues.QUEUE;

public class QueueMain {
    public static void main(String[] args) {
        // CustomQueue queue = new CustomQueue(5);

        // queue.insert(3);
        // queue.insert(2);
        // queue.insert(1);

        //

        // System.out.println(queue.remove());
        // queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        System.out.println(queue.remove());
        queue.display();

    }

}
