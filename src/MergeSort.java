package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class MergeSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public MergeSort(String optionsText) {
        super(optionsText);
    }

    public void sort(ArrayList<Integer> data) {
        if (data.size() > 1) {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();

            for (int i = 0; i < data.size() / 2; i++)
                left.add(data.get(i));
            for (int i = data.size() / 2; i < data.size(); i++)
                right.add(data.get(i));

            sort(left);
            sort(right);

            merge(left, right, data);
        }
    }

    public void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> data) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                data.set(k, left.get(i));
                i++;
                swaps++;
            } else {
                data.set(k, right.get(j));
                j++;
                swaps++;
            }
            comparisons++;
            k++;
        }

        while (i < left.size()) {
            data.set(k, left.get(i));
            i++; 
            k++;
            comparisons++;
            swaps++;
        }

        while (j < right.size()) {
            data.set(k, right.get(j));
            j++;
            k++;
            comparisons++;
            swaps++;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        start = Instant.now();

        sort(data);

        timeElapsed = Duration.between(start, Instant.now());

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        System.out.println(
                "Time: " + timeElapsed.getNano() + " Nanoseconds, Comparisons: " + comparisons + ", Sorts: " + swaps);
    }
}