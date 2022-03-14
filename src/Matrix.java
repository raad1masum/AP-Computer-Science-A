package src;

public class Matrix extends Blueprint {
    private final int[][] matrix;

    public Matrix(String optionsText, int[][] matrix) {
        super(optionsText);
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1)
                    str.append("  ");
                else
                    str.append(matrix[i][j] + " ");
            }
            str.append("\n");
        }

        return str.toString();
    }

    public String reverse() {
        StringBuilder str = new StringBuilder();

        for (int i = matrix.length;  0 < i; i--) {
            for (int j =  matrix[i-1].length; 0 < j; j--) {
                if (matrix[i-1][j-1]==-1) 
                    str.append("  ");
                else
                    str.append(matrix[i-1][j-1] + " ");
            }
            str.append("\n");
        }
        
        return str.toString();
    }

    static int[][] keypad() {
        return new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { -1, 0, -1 } };
    }

    static int[][] numbers() {
        return new int[][] { { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    public void run() {
        Matrix m0 = new Matrix(null, keypad());
        System.out.println("Keypad:");
        System.out.println(m0);
        System.out.println(m0.reverse());

        Matrix m1 = new Matrix(null, numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);
        System.out.println(m1.reverse());
    }
}
