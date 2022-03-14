package src;
public abstract class Blueprint {
    String optionsText;

    public Blueprint(String optionsText) {
        this.optionsText = optionsText;
    }

    public abstract void run();

    public String getOptionsText() {
        return optionsText;
    }
}
