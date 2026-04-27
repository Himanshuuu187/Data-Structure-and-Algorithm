package HeapDataStructure;
import java.util.ArrayList;

class main {

    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.Insert(24);
        heap.Insert(96);
        heap.Insert(75);
        heap.Insert(64);

        // System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
    
}
