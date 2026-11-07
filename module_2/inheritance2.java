package module_2;
class A{
    private int i = 1;
    int j = 2;
    void display1(){
        System.out.println(i);
    }


}
class B extends A{
    int k = 3;
    void display2(){
        System.out.println(j+" "+k);
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        B b = new B();

        b.k=10;

        b.display2();

    }
}
