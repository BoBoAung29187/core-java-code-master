package ch6methodsandclasses;

public class MyClass1 {
    int x;
    MyClass1() {
        System.out.println("Inside MyClass().");
        x = 0;
    }
    //Construct objects in a variety of ways.
    MyClass1(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }
    MyClass1(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }
    MyClass1(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}
