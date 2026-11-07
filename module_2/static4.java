package module_2;
class dd{
    int a =10;
    int b = 20;
    dd(){
        System.out.println("constructor");
    }

    static{
        System.out.println("Static 1");
    }
    static{
        System.out.println("Static 2");
    }

}
public class static4 {
    public static void main(String[] args) {
        dd dd=new dd();
    }
}
