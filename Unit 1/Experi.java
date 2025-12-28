package mypack;

public class AccessDemo {

    public int a = 10;        // Public
    protected int b = 20;     // Protected
    int c = 30;               // Default
    private int d = 40;       // Private

    public void show() {
        System.out.println("Public a = " + a);
        System.out.println("Protected b = " + b);
        System.out.println("Default c = " + c);
        System.out.println("Private d = " + d);
    }
}