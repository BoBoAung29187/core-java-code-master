package ch2datatypesandoperators;

// Demonstrate casting.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        //Truncation will occur in this conversion.
        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);
        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        i = 257;
        b = (byte) i;
        //Information loss this time. A byte cannot hold the value 257. System.out.println("Value of b: " + b);
        b = 88; // ASCII code for X
        ch = (char) b;
        //Cast between incompatible types
        System.out.println("ch: " + ch);
    }
}
