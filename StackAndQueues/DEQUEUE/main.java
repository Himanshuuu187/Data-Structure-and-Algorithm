package StackAndQueues.DEQUEUE;

import java.util.Deque;
import java.util.ArrayDeque;

public class main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); 

        deque.add(5);
        deque.addLast(1);

        System.out.println(deque.removeFirst());
    }
    
}
