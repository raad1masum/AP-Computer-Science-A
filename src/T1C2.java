package src;

import java.util.Arrays;
import java.util.List;

public class T1C2 extends Blueprint {
    String optionsText;

    public T1C2(String optionsText) {
        super(optionsText);
    }

    public void run() {
        List<Integer> list1 = Arrays.asList(1, 4, 5, 8);
        List<Integer> list2 = Arrays.asList(2, 3, 6, 7);

        Queue<Integer> Queue1 = new Queue<Integer>();
        Queue<Integer> Queue2 = new Queue<Integer>();

        Queue<Integer> output = new Queue<Integer>();

        for (int num : list1) {
            Queue1.push(num);
        }

        for (int num : list2) {
            Queue2.push(num);
        }

        System.out.println("List 1: " + Queue1.display());
        System.out.println("List 2: " + Queue2.display());

        while ((Queue1.display() != null) || (Queue2.display() != null)) {
            try {
                if ((Queue1.peak() < Queue2.peak())) {
                    output.push(Queue1.peak());
                    Queue1.pop();
                } else if ((Queue2.peak()) < Queue1.peak() || ((Queue1.peak()) == null) || (Queue2.peak() == null)) {
                    output.push(Queue2.peak());
                    Queue2.pop();
                }
            } catch (Exception e) {
                if (Queue1.peak() == null) {
                    output.push(Queue2.peak());
                    Queue2.pop();
                    break;
                } else if (Queue2.peak() == null) {
                    output.push(Queue1.peak());
                    Queue1.pop();
                    break;
                }
            }
        }

        System.out.println("Output: " + output.display());
    }
}
