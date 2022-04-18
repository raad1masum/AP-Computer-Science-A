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

    // abstract method for getting stats
    public abstract int[] getStats(ArrayList<Integer> data);

    // standard abstract run method
    public abstract void run();

    // simple abstract method for options text
    public String getOptionsText() {
        return optionsText;
    }
}
