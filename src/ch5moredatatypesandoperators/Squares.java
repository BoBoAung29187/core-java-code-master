package ch5moredatatypesandoperators;

// Initialize a two-dimensional array.
class Squares {
    public static void main(String args[]) {
        int sqrs[][] = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}
        };
        int i, j;
        // Notice how each row has its own set of initializers.
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}
