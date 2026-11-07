package module_2;

class aaa {
    aaa() {
        System.out.println("Constructor of Class A");
    }
}

class Bb extends aaa {
    Bb() {
        System.out.println("Constructor of Class B");
    }
}

class C extends Bb {
    C() {
        System.out.println("Constructor of Class C");
    }
}

public class supers {
    public static void main(String[] args) {
        C obj = new C();
    }
}