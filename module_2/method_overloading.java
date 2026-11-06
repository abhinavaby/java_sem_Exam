package module_2;

class Add{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);

    }
    void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);

    }
}

public class method_overloading {
    public static void main(String[] args) {
        Add a = new Add();
        a.add(1,2);
        a.add(1,2,3);
        a.add(1,2,3,4);


    }
}
