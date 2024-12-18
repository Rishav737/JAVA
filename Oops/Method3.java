class A {
    void show() {
        System.out.println("method one");
    }
}

class B {
    void display() {
        System.out.println("method one");
    }
}

class C {
    void show1() {
        System.out.println("method one");
    }

    void show2() {
        System.out.println("method second");
    }

    void show3() {
        System.out.println("method three");
    }
}

class D {
    void display1() {
        System.out.println("method one");
    }

    void display2() {
        System.out.println("method second");
    }

    void display3() {
        System.out.println("method three");
    }

    void display4() {
        System.out.println("method four");
    }
}

public class Method3 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
        B p1 = new B();
        p1.display();
        C a = new C();
        a.show1();
        a.show2();
        a.show3();
        D b = new D();
        b.display1();
        b.display2();
        b.display3();
        b.display4();
    }
}
