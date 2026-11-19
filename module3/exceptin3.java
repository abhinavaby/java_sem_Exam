package module3;

public class exceptin3 {
    public static void main(String[] args) {
        //multiple catch
        try{
            System.out.println("hello");
            double a = 10/2.3; //or float a = 10/2.3f

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
