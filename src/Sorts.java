package src;

import java.util.ArrayList;

public class Sorts extends Blueprint {
    
    public Sorts(String optionsText) {
        super(optionsText);
        
    }
    
    // analyze and return stats in an array
    public long[] analyze(BlueprintSort sortAlgorithm) {
        ArrayList<Integer> times = new ArrayList<Integer>();
        ArrayList<Integer> comparisons = new ArrayList<Integer>();
        ArrayList<Integer> sorts = new ArrayList<Integer>();
        long averageTime, averageComparisons, averageSorts;
        
        // run tests 12 times
        for (int i = 0; i < 12; i++) {
            ArrayList<Integer> data = new ArrayList<Integer>();
            
            // generate random data
            for (int j = 0; j < 5000; j++)
                data.add((int) (Math.random() * 50000));

            // run sort and add stats to arrays
            times.add(sortAlgorithm.getStats(data)[0]);
            comparisons.add(sortAlgorithm.getStats(data)[1]);
            sorts.add(sortAlgorithm.getStats(data)[2]);
        }

        // compute time average
        long sumTime = 0;
        for (int i = 0; i < times.size(); i++)
            sumTime += times.get(i);
        averageTime = sumTime / times.size();

        // compute comparisons average
        long sumComparison = 0;
        for (int i = 0; i < comparisons.size(); i++)
            sumComparison += comparisons.get(i);
        averageComparisons = sumComparison / comparisons.size();

        // compute sorts average
        long sumSorts = 0;
        for (int i = 0; i < sorts.size(); i++)
            sumSorts += sorts.get(i);
        averageSorts = sumSorts / sorts.size();

        // return stats as array
        long[] averages = {averageTime, averageComparisons, averageSorts};
        return averages;
    }

    @Override
    public void run() {
        // create objects for each sorting method
        BubbleSort bubbleSort = new BubbleSort("Bubble Sort");
        SelectionSort selectionSort = new SelectionSort("Selection Sort");
        InsertionSort insertionSort = new InsertionSort("Insertion Sort");
        MergeSort mergeSort = new MergeSort("Merge Sort");

        // print stats for each sorting method
        System.out.println("Bubble Sort: " + analyze(bubbleSort)[0] + " nanoseconds, " + analyze(bubbleSort)[1] + " comparisons, " + analyze(bubbleSort)[2] + " sorts");
        System.out.println("Selection Sort: " + analyze(selectionSort)[0] + " nanoseconds, " + analyze(selectionSort)[1] + " comparisons, " + analyze(selectionSort)[2] + " sorts");
        System.out.println("Insertion Sort: " + analyze(insertionSort)[0] + " nanoseconds, " + analyze(insertionSort)[1] + " comparisons, " + analyze(insertionSort)[2] + " sorts");
        System.out.println("Merge Sort: " + analyze(mergeSort)[0] + " nanoseconds, " + analyze(mergeSort)[1] + " comparisons, " + analyze(mergeSort)[2] + " sorts");
    }   
}
