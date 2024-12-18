class A {
    void show() {
        System.out.println(" first method");
    }

    void display() {
        System.out.println("second method");
    }
}

public class Method2 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
        p.display();
    }
}
