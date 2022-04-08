package src;

public abstract class BlueprintSort extends Blueprint {
    String optionsText;
    int comparisons;
    int swaps;

    public BlueprintSort(String optionsText) {
        super(optionsText);
        this.optionsText = optionsText;
    }

    public abstract void run();

    public String getOptionsText() {
        return optionsText;
    }
}
