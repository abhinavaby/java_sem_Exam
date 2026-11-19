package module3;

public class throww {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            int a=10;
            if(a==10){
                throw new ArithmeticException("number 10 cant be given"); //can also use Exceeption
            }
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
