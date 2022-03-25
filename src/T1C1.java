package src;

import java.util.ArrayList;

public class T1C1 extends Blueprint {
    String optionsText;

    public T1C1(String optionsText) {
        super(optionsText);
    }

    public void run() {
        ArrayList<String> arr = new ArrayList<String>();

        for (String i : "Seven slimy snakes sallying slowly slithered southward".split(" ")) {
            arr.add(i);
        }

        Queue<String> queue = new Queue<String>();

        for (String i : arr) {
            System.out.println("Enqueued Data: " + i);
            queue.push(i);

            System.out.print("is Counted: " + queue.length() + " ");

            System.out.println(queue.display().toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" ", " ")
                    .replaceAll(",", " "));
        }

        int iter = queue.length();
        for (int i = 0; i <= iter; i++) {
            System.out.println("Dequeued Data: " + queue.peak());
            queue.pop();

            System.out.println("is Counted: " + queue.length() + " ");

            System.out.print("Data: ");
            System.out.print(queue.display().toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" ", " ")
                    .replaceAll(",", " "));

            if (queue.peak() == null) {
                System.out.println("null");
            }
        }
    }
}
