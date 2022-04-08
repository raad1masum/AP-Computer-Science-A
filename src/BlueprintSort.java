package src;

public abstract class BlueprintSort extends Blueprint {
    String optionsText;

    public BlueprintSort(String optionsText) {
        super(optionsText);
        this.optionsText = optionsText;
    }

    public abstract void run();

    public String getOptionsText() {
        return optionsText;
    }
}
