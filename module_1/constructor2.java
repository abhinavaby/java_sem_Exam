package module_1;
class bb{
    int a;
    int b;
    bb(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);

    }
}

public class constructor2 {
    public static void main(String[] args) {
        bb bb = new bb(1,2);
    }
}
