package ch5moredatatypesandoperators;

public class ShowBits1Demo {
    public static void main(String args[]) {
        ShowBits1 b = new ShowBits1(8);
        ShowBits1 i = new ShowBits1(32);
        ShowBits1 li = new ShowBits1(64);
        System.out.println("123 in binary: ");
        b.show(123);
        System.out.println("\n87987 in binary: ");
        i.show(87987);
        System.out.println("\n237658768 in binary: ");
        li.show(237658768);
        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
