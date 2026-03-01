package StackAndQueues.QUEUE;

import java.util.Queue;
import java.util.LinkedList; 

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);

        


        System.out.println(queue.remove());  // Output : 3

        System.out.println(queue.peek());    // Output : 2

    }
    
}
