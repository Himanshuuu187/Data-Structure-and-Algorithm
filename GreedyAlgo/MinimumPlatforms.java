import java.util.*;

public class MinimumPlatforms {

    public static int findPlatforms(int[] arrival, int[] departure) {

        int n = arrival.length;

        // Sort arrival and departure times
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 0;
        int maxPlatforms = 0;

        int i = 0; // Arrival pointer
        int j = 0; // Departure pointer

        while (i < n && j < n) {

            // New train arrives before the previous train departs
            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;

                maxPlatforms = Math.max(maxPlatforms, platforms);
            }

            // A train departs
            else {
                platforms--;
                j++;
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {

        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findPlatforms(arrival, departure);

        System.out.println("Minimum number of platforms required = "
                           + result);
    }
}