package src;

import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

public class MergeSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public MergeSort(String optionsText) {
        super(optionsText);
    }
    
    // run bubble sort but return stats
    @Override
    public int[] getStats(ArrayList<Integer> data) {
        // default to a sorted list
        start = Instant.now();
        // run sort method
        sort(data);
        // log raw time
        timeElapsed = Duration.between(start, Instant.now());

        // return data as array of ints
        int[] out = {timeElapsed.getNano(), comparisons, swaps};
        return out;
    }

    public void sort(ArrayList<Integer> data) {
        // check if merge is not at the end
        if (data.size() > 1) {
            // create left and right arrays
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();

            // split data into left and right
            for (int i = 0; i < data.size() / 2; i++)
                left.add(data.get(i));
            for (int i = data.size() / 2; i < data.size(); i++)
                right.add(data.get(i));

            // sort left and right
            sort(left);
            sort(right);

            // merge left and right
            merge(left, right, data);
        }
    }

    // merge method
    public void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> data) {
        int i = 0, j = 0, k = 0;

        // while both arrays have elements
        while (i < left.size() && j < right.size()) {
            // check if arrays are empty
            if (left.get(i).compareTo(right.get(j)) < 0) {
                data.set(k, left.get(i));
                i++;
                swaps++;
            } else {
                // set data
                data.set(k, right.get(j));
                j++;
                swaps++;
            }
            // increment comparisons counter
            comparisons++;
            k++;
        }

        // increment stats for left
        while (i < left.size()) {
            data.set(k, left.get(i));
            i++; 
            k++;
            comparisons++;
            swaps++;
        }

        // increment stats for right
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
        // create random array of ints
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        // print out random array
        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        // timer start
        start = Instant.now();

        // sort data
        sort(data);

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