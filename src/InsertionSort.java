package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class InsertionSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public InsertionSort(String optionsText) {
        super(optionsText);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        start = Instant.now();

        for (int i = 1; i < data.size(); i++) {
            int j = i;
            while (j > 0 && data.get(j) < data.get(j - 1)) {
                comparisons++;
                int tmp = data.get(j - 1);
                data.set(j - 1, data.get(j));
                data.set(j, tmp);
                swaps++;
                j--;
            }
        }
        
        timeElapsed = Duration.between(start, Instant.now());

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        System.out.println("Time: " + timeElapsed.getNano() + " Nanoseconds, Comparisons: " + comparisons + ", Sorts: " + swaps);
    }
}