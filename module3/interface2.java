package module3;

interface myinterface{
    void method1();
    void method2();

}

interface w extends myinterface{
    void method3();

}

class inter implements w{


    public void method3() {
        System.out.println("3");

    }


    public void method1() {
        System.out.println("1");

    }


    public void method2() {
        System.out.println("2");

    }
}



public class interface2 {
    public static void main(String[] args) {
        inter obj = new inter();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
