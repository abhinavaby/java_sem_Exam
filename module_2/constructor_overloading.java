package module_2;

class q{
    int a,b,c;
    q(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    q(){
        a=b=c=-1;

    }
    q(int a){
        this.a=a;
        b=c=a;

    }
    q(int a,int b){
        this.a=a;
        this.b=b;
        c=-1;

    }
    void sum(){
        System.out.println("sum = "+(a+b+c));
    }
}


public class constructor_overloading {
    public static void main(String[] args) {
        q q=new q(1,1,1);
        q.sum();
    }
}
