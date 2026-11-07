package module_2;



class Parent {
    // This value is locked and cannot be changed after initialization
    final String pa = "Hello , We are in parent class variable";
}

class Child extends Parent {
    String ch = "Hello , We are in child class variable";
}

public class final3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.pa); // Works

        Child c = new Child();
        System.out.println(c.ch); // Works

        // ❌ COMPILE-ERROR: Un-commenting the line below will crash compilation
        // p.pa = "changed";

        c.ch = "changed me"; // Works: ch is not final

        System.out.println(c.pa); // Works: Inherited final variable
        System.out.println(c.ch); // Prints: "changed me"
    }
}

