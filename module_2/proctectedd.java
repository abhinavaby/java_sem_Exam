package module_2;
class e{
    protected int i=2;
    protected int j=3;}

class yy extends e{
    protected int k=4;
    void display1(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


        }


}


public class proctectedd {
    public static void main(String[] args) {
        yy y = new yy();
        y.display1();





    }
}
