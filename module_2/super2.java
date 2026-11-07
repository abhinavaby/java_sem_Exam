package module_2;
class parent2{
    int i = 1;
    void display(){
        System.out.println("parent2 display");
    }
}
class child3 extends parent2{
    int j = 2;
    void display(){
        System.out.println("child3 display");
        super.display();

    }
}
class child4 extends child3{
    int k = 3;
    void display(){
        System.out.println("child4 display");
        super.display();
    }
    void display2(){
        System.out.println(i+j+k);
    }
}

public class super2 {
    public static void main(String[] args) {
        child4 obj = new child4();
        obj.display();
        obj.display2();
    }
}
