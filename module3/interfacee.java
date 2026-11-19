package module3;

interface polygon{
    void getarea(int a,int b);
}
class square implements polygon{
    public void getarea(int a,int b){
        System.out.println(a*b);
    }
}

public class interfacee {
    public static void main(String[] args) {
        square i=new square();
        i.getarea(3,2);
    }
}
