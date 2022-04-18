package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class SelectionSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public SelectionSort(String optionsText) {
        super(optionsText);
    }
    
    // run bubble sort but return stats
    @Override
    public int[] getStats(ArrayList<Integer> data) {
        // timer start
        start = Instant.now();
        // iterate through data
        for (int i = 0; i < data.size() - 1; i++) {
            int min = i;
            // O(n^2)
            for (int j = i + 1; j < data.size(); j++) {
                comparisons++;
                // check if order is incorrect
                if (data.get(j) < data.get(min))
                    min = j;
            }
            // run sort
            if (min != i) {
                int tmp = data.get(i);
                data.set(i, data.get(min));
                data.set(min, tmp);
                swaps++;
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

       // timer start
       start = Instant.now();
       // iterate through data
       for (int i = 0; i < data.size() - 1; i++) {
           int min = i;
           // O(n^2)
           for (int j = i + 1; j < data.size(); j++) {
               comparisons++;
               // check if order is incorrect
               if (data.get(j) < data.get(min))
                   min = j;
           }
           // run sort
           if (min != i) {
               int tmp = data.get(i);
               data.set(i, data.get(min));
               data.set(min, tmp);
               swaps++;
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