package module_1;
class b{
    int length,breadth,height;
    b(){
        length=breadth=height=10;
    }
    void vol(){
        System.out.println("vol : "+length*breadth*height);

    }
}


public class constructor{
    public static void main(String[] args) {
        b b = new b();
        b.length=b.breadth=b.height=1;
        b.vol();

    }
}
