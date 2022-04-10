package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class SelectionSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public SelectionSort(String optionsText) {
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

        for (int i = 0; i < data.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.size(); j++) {
                comparisons++;
                if (data.get(j) < data.get(min))
                    min = j;
            }
            if (min != i) {
                int tmp = data.get(i);
                data.set(i, data.get(min));
                data.set(min, tmp);
                swaps++;
            }
        }
        
        timeElapsed = Duration.between(start, Instant.now());

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        System.out.println("Time: " + timeElapsed.getNano() + " Nanoseconds, Comparisons: " + comparisons + ", Sorts: " + swaps);
    }
}