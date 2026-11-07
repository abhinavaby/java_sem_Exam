package module_2;
class aa {
    void f(){
        System.out.println("hello");
    }
}
class bb extends aa{
    void f(){
        System.out.println("hello guys");
    }
}

public class method_overriding {
    public static void main(String[] args) {
       bb b =new bb();
       b.f();
    }
}
