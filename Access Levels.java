package main;

public class ClassA {
    private int privateVar;
    public int publicVar;
    int defaultVar;
}

package main;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        int v1 = a.publicVar;   // Works
        int v2 = a.defaultVar;  // Works
        int v3 = a.privateVar;  // Doesn't work

    }
}

package other;

public class ClassC {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        int v1 = a.publicVar;   // Works
        int v2 = a.defaultVar;  // Doesn't work
        int v3 = a.privateVar;  // Doesn't work
    }
}
