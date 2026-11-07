package module_2;

// ==========================================
// EXAMPLE 1: DEMONSTRATING A FINAL METHOD
// ==========================================
class MethodParent {
    final void m1() {
        System.out.println("This is a final method.");
    }
}

class MethodChild extends MethodParent {
    // ❌ COMPILE-ERROR! A final method cannot be overridden.
    /*
    void m1() {
        System.out.println("Illegal!");
    }
    */
}

// ==========================================
// EXAMPLE 2: DEMONSTRATING A FINAL CLASS
// ==========================================
final class FinalClassParent {
    // Methods and fields go here
    void display() {
        System.out.println("Inside a final class.");
    }
}

// ❌ COMPILE-ERROR! A final class cannot be extended (subclassed).
/*
class ClassChild extends FinalClassParent {

}
*/

// ==========================================
// MAIN CLASS TO RUN THE VALID PARTS
// ==========================================
public class finall2 {
    public static void main(String[] args) {
        // Testing the valid parts of Example 1
        MethodChild childObj = new MethodChild();
        childObj.m1(); // Inherited successfully

        // Testing the valid parts of Example 2
        FinalClassParent finalObj = new FinalClassParent();
        finalObj.display();
    }
}
