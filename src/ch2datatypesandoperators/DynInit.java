package ch2datatypesandoperators;

// Demonstrate dynamic initialization.
class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;
        //volume is dynamically initialized at run time.
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Volume is " + volume);
    }
}
