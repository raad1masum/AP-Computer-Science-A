package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class BubbleSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public BubbleSort(String optionsText) {
        super(optionsText);
    }

    // run bubble sort but return stats
    @Override
    public int[] getStats(ArrayList<Integer> data) {
        // default to a sorted list
        boolean sorted = true;
        // timer start
        start = Instant.now();
        // iterate through data
        for (int i = 1; i < data.size(); i++) {
            // O(n^2)
            for (int j = 1; j < data.size(); j++) {
                // incrememnt comparisons counter
                comparisons++;
                // check if order is incorrect
                if (data.get(j) < data.get(j - 1)) {
                    // change state of sorted boolean
                    sorted = false;
                    // swap values
                    int tmp = data.get(j - 1);
                    data.set(j - 1, data.get(j));
                    data.set(j, tmp);
                    // increment swap counter
                    swaps++;
                }
            }
            // stop sortinng if the list is sorted
            if (sorted)
                break;
        }
        // log raw time
        timeElapsed = Duration.between(start, Instant.now());

        // return data as array of ints
        int[] out = { timeElapsed.getNano(), comparisons, swaps };
        return out;
    }

    @Override
    public void run() {
        // create random array of ints
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        // print out random array
        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        // default to a sorted list
        boolean sorted = true;
        // timer start
        start = Instant.now();
        // iterate through data
        for (int i = 1; i < data.size(); i++) {
            // O(n^2)
            for (int j = 1; j < data.size(); j++) {
                // incrememnt comparisons counter
                comparisons++;
                // check if order is incorrect
                if (data.get(j) < data.get(j - 1)) {
                    // change state of sorted boolean
                    sorted = false;
                    // swap values
                    int tmp = data.get(j - 1);
                    data.set(j - 1, data.get(j));
                    data.set(j, tmp);
                    // increment swap counter
                    swaps++;
                }
            }
            // stop sortinng if the list is sorted
            if (sorted)
                break;
        }
        // log raw time
        timeElapsed = Duration.between(start, Instant.now());

        // print out sorted array
        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        // print out sort stats
        System.out.println(
                "Time: " + timeElapsed.getNano() + " Nanoseconds, Comparisons: " + comparisons + ", Sorts: " + swaps);
    }
}