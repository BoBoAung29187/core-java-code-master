package ch2datatypesandoperators;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b = 0;
        int i;
        //No cast needed because result is already elevated to int.
        i = b * b; // OK, no cast needed
        b = 10;
        //Cast is needed here to assign an int to a byte! b = (byte) (b * b); // cast needed!!
        System.out.println("i and b: " + i + " " + b);
    }
}

