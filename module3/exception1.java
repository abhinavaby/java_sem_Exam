package module3;

public class exception1 {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            int b = 10/0;

        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
