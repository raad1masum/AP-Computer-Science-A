package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1C3 extends Blueprint {
    String optionsText;

    public T1C3(String optionsText) {
        super(optionsText);
    }

    public void run() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Queue<Integer> start = new Queue<Integer>();

        for (int num : list) {
            start.push(num);
        }

        Stack<Integer> output = new Stack<Integer>();

        int m = start.length();
        for (int i = 0; i < m; i++) {
            output.add(start.peak());
            start.pop();
        }

        ArrayList<Integer> output_list = new ArrayList<Integer>();

        int r = output.length();
        for (int i = 0; i < r; i++) {
            output_list.add(output.peak());
            output.delete();
        }

        System.out.print("Before: ");

        System.out.println(list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" ", " ")
                .replaceAll(",", " "));

        System.out.print("After: ");
        System.out.println(output_list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" ", " ")
                .replaceAll(",", " "));
    }
}
