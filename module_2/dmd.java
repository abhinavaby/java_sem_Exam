package module_2;
class o{
    void ss(){
        System.out.println("hello");

    }
}
class vv extends o{
    void ss(){
        System.out.println("hello guys");
    }
}

public class dmd {
    public static void main(String[] args) {
        o o = new vv();
        o.ss();


    }
}
