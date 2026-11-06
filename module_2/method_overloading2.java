package module_2;

class Over1 {
    void test(String name, int age) {
        System.out.println("name and age: " + name + " " + age);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(int a, double b) {
        System.out.println("a and b: " + a + " " + b);
    }
}

public class method_overloading2 {
    public static void main(String[] args) {
        Over1 ob = new Over1();

        // These work perfectly:
        ob.test("smitha", 24);         // Invokes test(String, int)
        ob.test(10, 20);               // Invokes test(int, int)
        ob.test(11, 10.555);           // Invokes test(int, double)

        // To make the erroneous lines work, you would have to match the parameters:
        // ob.test("smitha", 24);      // Corrected sequence from (24, "smitha")
        // ob.test(11, 10.555555);     // Corrected sequence from (10.555555, 11)
    }
}

