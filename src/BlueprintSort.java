package src;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public abstract class BlueprintSort extends Blueprint {
    String optionsText;
    Instant start;
    Duration timeElapsed;
    int comparisons, swaps;

    public BlueprintSort(String optionsText) {
        super(optionsText);
        this.optionsText = optionsText;
    }

    public abstract int[] getStats(ArrayList<Integer> data);
    public abstract void run();

    public String getOptionsText() {
        return optionsText;
    }
}
