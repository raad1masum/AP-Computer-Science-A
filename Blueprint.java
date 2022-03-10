public abstract class Blueprint {
    String optionsText;

    public Blueprint(String optionsText) {
        this.optionsText = optionsText;
    }

    public abstract void run();

    @Override
    public String toString() {
        return optionsText;
    }
}
