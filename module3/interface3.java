package module3;


interface a{
    void method1();
    default void method3() {
        System.out.println("this is a method inside interface a");
    }
    final int a=10;

    static void method4(){
        System.out.println("this is a method inside interface a (static)");
    }

}

interface b{
    void method2();
}

class c implements a,b{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
}

public class interface3 {
    public static void main(String[] args) {
        c c = new c();
        c.method1();
        c.method3();
        System.out.println(c.a);
        a.method4();

    }
}
