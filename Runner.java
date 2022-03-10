public abstract class Runner {
    String optionsText;

    public Runner(String optionsText) {
        this.optionsText = optionsText;
    }

    public abstract void run();

    @Override
    public String toString() {
        return optionsText;
    }
}
