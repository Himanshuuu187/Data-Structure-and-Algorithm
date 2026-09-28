import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        // Store activities as {start, finish}
        int[][] activities = new int[start.length][2];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        // Sort activities according to finish time
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);

        // Select first activity
        int count = 1;
        int lastFinish = activities[0][1];

        System.out.println("Selected Activities:");

        System.out.println(
            "Start: " + activities[0][0] +
            " Finish: " + activities[0][1]
        );

        // Select remaining activities
        for (int i = 1; i < activities.length; i++) {

            // Activity is compatible if its start >= previous finish
            if (activities[i][0] >= lastFinish) {

                System.out.println(
                    "Start: " + activities[i][0] +
                    " Finish: " + activities[i][1]
                );

                count++;
                lastFinish = activities[i][1];
            }
        }

        System.out.println("Maximum number of activities = " + count);
    }
}