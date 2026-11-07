package module_2;
class a{
    int i;
    int j;

    void display1(){
        System.out.println(i+" "+j);
    }
}
class b extends a{
    int k;
    void display2(){
        System.out.println(i+" "+j+" "+k);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        b b = new b();

        b.i=1;
        b.j=2;
        b.k=3;

        b.display1();
        b.display2();
    }
}
