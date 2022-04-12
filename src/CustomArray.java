package src;

public class CustomArray extends Blueprint {
    // instance vars with array and array size
	private int[] array;
	private int size;
	
    // constructor for custom array to set instance vars
	public CustomArray(String optionsText, int size) {
        super(optionsText);
		this.size = size;
		array = new int[size];
	}
	
    // set value in array with index
	public void set(int index, int value) {
		array[index] = value;
	}
	
    // get value in array with index
	public int get(int index) {
		return array[index];
	}
	
    // get size of array
	public int size() {
		return size;
	}

    // custom bubble sort on array
    public int[] sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    @Override
    public void run() {
        // add random ints to array for testing
        for (int i = 0; i < size(); i++)
            set(i, (int) (Math.random() * 50000));

        // print default array
        for (int i = 0; i < size; i++)
            System.out.print(get(i) + " ");
        System.out.println();

        // print sorted array
        for (int i = 0; i < size; i++)
            System.out.print(sort()[i] + " ");
        System.out.println();
    }
}