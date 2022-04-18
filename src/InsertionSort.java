package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class InsertionSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public InsertionSort(String optionsText) {
        super(optionsText);
    }
    
    // abstract method for getting stats
    @Override
    public int[] getStats(ArrayList<Integer> data) {
        // timer start
        start = Instant.now();
        // iterate through data
        for (int i = 1; i < data.size(); i++) {
            int j = i;
            // O(n^2)
            while (j > 0 && data.get(j) < data.get(j - 1)) {
                // incrememnt comparisons counter
                comparisons++;
                // insert in correct order
                int tmp = data.get(j - 1);
                data.set(j - 1, data.get(j));
                data.set(j, tmp);
                swaps++;
                j--;
            }
        }
        // log raw time
        timeElapsed = Duration.between(start, Instant.now());
        
        // return data as array of ints
        int[] out = {timeElapsed.getNano(), comparisons, swaps};
        return out;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        start = Instant.now();

        // timer start
        start = Instant.now();

        // iterate through data
        for (int i = 1; i < data.size(); i++) {
            int j = i;
            // O(n^2)
            while (j > 0 && data.get(j) < data.get(j - 1)) {
                // incrememnt comparisons counter
                comparisons++;
                // insert in correct order
                int tmp = data.get(j - 1);
                data.set(j - 1, data.get(j));
                data.set(j, tmp);
                swaps++;
                j--;
            }
        }
        // log raw time
        timeElapsed = Duration.between(start, Instant.now());

        // print out sorted array
        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        // print out sort stats
        System.out.println("Time: " + timeElapsed.getNano() + " Nanoseconds, Comparisons: " + comparisons + ", Sorts: " + swaps);
    }
}