import java.util.*;

public class HuffmanCoding {

    // Node of Huffman Tree
    static class Node {
        char ch;
        int freq;
        Node left, right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(int freq, Node left, Node right) {
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    // Generate Huffman Codes
    static void generateCodes(Node root, String code) {

        if (root == null) {
            return;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
            return;
        }

        generateCodes(root.left, code + "0");
        generateCodes(root.right, code + "1");
    }

    public static void main(String[] args) {

        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] frequencies = {5, 9, 12, 13, 16, 45};

        // Min Heap
        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> a.freq - b.freq);

        // Add all characters to priority queue
        for (int i = 0; i < characters.length; i++) {
            pq.add(new Node(characters[i], frequencies[i]));
        }

        // Build Huffman Tree
        while (pq.size() > 1) {

            // Take two nodes with smallest frequency
            Node left = pq.poll();
            Node right = pq.poll();

            // Create new internal node
            Node newNode = new Node(
                left.freq + right.freq,
                left,
                right
            );

            pq.add(newNode);
        }

        // Root of Huffman Tree
        Node root = pq.poll();

        System.out.println("Huffman Codes:");

        generateCodes(root, "");
    }
}