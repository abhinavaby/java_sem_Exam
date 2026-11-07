package module_2;
class p1{
    int data = 1;
    void display(){
        System.out.println("data is:"+data);
    }
}
class p2 extends p1{
    int data = 2;
    void display(){
        System.out.println("data is:"+data);
        System.out.println("old data value: "+super.data);
        System.out.println("old display : ");
        super.display();
    }
}

public class superr {
    public static void main(String[] args) {
        p2 p = new p2();
        p.display();
    }
}
