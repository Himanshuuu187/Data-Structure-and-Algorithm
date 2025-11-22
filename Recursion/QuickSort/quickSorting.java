import java.util.Arrays;

public class quickSorting {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 7, 8};
        Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] num, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = num[m];

        while (s <= e) {
            while (num[s] < pivot) {
                s++;
            }
            while (num[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = num[s]; 
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }

        // Important: Recursively sort both halves
        Sort(num, low, e);
        Sort(num, s, hi);  // <-- You must include this line
    }
}


























