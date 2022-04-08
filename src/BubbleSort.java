package src;

import java.util.ArrayList;

public class BubbleSort extends BlueprintSort {
    ArrayList<Integer> data = new ArrayList<Integer>();

    public BubbleSort(String optionsText) {
        super(optionsText);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++)
            data.add((int) (Math.random() * 50000));

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        boolean sorted = true;
        for (int i = 1; i < data.size(); i++) {
            for (int j = 1; j < data.size(); j++) {
                comparisons++;
                if (data.get(j) < data.get(j - 1)) {
                    sorted = false;
                    int tmp = data.get(j - 1);
                    data.set(j - 1, data.get(j));
                    data.set(j, tmp);
                    swaps++;
                }
            }
            if (sorted)
                break;
        }

        for (int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + " ");
        System.out.println();

        System.out.println("Comparisons: " + comparisons + " Sorts: " + swaps);
    }
}