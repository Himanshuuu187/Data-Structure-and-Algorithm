import java.util.*;

class FractionalKnapsack {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static double fractionalKnapsack(int W, Item[] items) {

        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight
            )
        );

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {

            // Take the complete item
            if (currentWeight + item.weight <= W) {
                currentWeight += item.weight;
                totalValue += item.value;
            }

            // Take only the fraction of the item
            else {
                int remainingWeight = W - currentWeight;

                totalValue +=
                    ((double) item.value / item.weight) * remainingWeight;

                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        int W = 50;

        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        double result = fractionalKnapsack(W, items);

        System.out.println("Maximum value = " + result);
    }
}