package ch5moredatatypesandoperators;

// Demonstrate a one-dimensional array.
class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;
        //Arrays are indexed from zero.
        for (i = 0; i < 10; i = i + 1)
            System.out.println("This is sample[" + i + "]: " +
                    sample[i]);
    }
}
