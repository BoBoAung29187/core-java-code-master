package ch3programcontrolstatements;

// Guess the letter game, 3rd version.
class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // get a char
        if (ch == answer) System.out.println("** Right **");
        else {
            // char ch, answer = 'K';
            System.out.print("...Sorry, you're ");
            //This is a nested if. // a nested if
            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}

