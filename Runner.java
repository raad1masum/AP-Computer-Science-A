public class Runner {
    String optionsText;

    public Runner(String optionsText) {
        this.optionsText = optionsText;
    }

    public void run() {
        System.out.println("running bruh");
    }

    @Override
    public String toString() {
        return optionsText;
    }
}
