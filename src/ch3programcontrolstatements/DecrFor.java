package ch3programcontrolstatements;

// A negatively running for loop.
class DecrFor {
    public static void main(String args[]) {
        int x;
        for (x = 100; x > -100; x -= 5)
            //Loop control variable is
            System.out.println(x); //decremented by 5 each time.
    }
}
