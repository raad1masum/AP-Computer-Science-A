public class Exit extends Blueprint {
    public Exit(String optionsText) {
        super(optionsText);
    }

    public void run() {
        System.exit(0);
    }
}
