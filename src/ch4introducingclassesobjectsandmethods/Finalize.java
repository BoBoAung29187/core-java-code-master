package ch4introducingclassesobjectsandmethods;

class Finalize {
    public static void main(String args[]) {
        int count;
        FDemo ob = new FDemo(0);
         /* Now, generate a large number of objects. At
          some point, garbage collection will occur.
          Note: you might need to increase the number
          of objects generated in order to force
          garbage collection. */
        for (count = 1; count < 100000; count++)
            ob.generator(count);
    }
}
