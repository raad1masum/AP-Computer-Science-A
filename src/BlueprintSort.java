package src;

import java.time.Duration;
import java.time.Instant;

public abstract class BlueprintSort extends Blueprint {
    String optionsText;
    Instant start;
    Duration timeElapsed;
    int comparisons, swaps;

    public BlueprintSort(String optionsText) {
        super(optionsText);
        this.optionsText = optionsText;
    }

    public abstract void run();

    public String getOptionsText() {
        return optionsText;
    }
}
