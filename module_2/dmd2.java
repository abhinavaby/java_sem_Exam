package module_2;
class parent{
    void display(){
        System.out.println("parent");
    }
}
class child1 extends parent{
    void display(){
        System.out.println("child1");
    }

}
class child2 extends parent{
    void display(){
        System.out.println("child2");
    }
}
public class dmd2 {
    public static void main(String[] args) {
        parent p = new child1();
        p.display();
        p = new child2();
        p.display();
    }
}
