package src;

public class IntByReference extends Blueprint {
    private int value;

    public IntByReference(String optionsText, int value) {
        super(optionsText);
        this.value = value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public void swapToLowHighOrder(IntByReference num) {
        if (this.value > num.value) {
            this.value = this.value - num.value;
            num.value = this.value + num.value;
            this.value = num.value - this.value;
        }
    }

    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(null, n0);
        IntByReference b = new IntByReference(null, n1);
        System.out.println("Before: " + a + " " + b);
        a.swapToLowHighOrder(b);
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

    public void run() {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }
}
