package module3;

public class throw_class {
    void check(int age){
        if(age<0){
            throw new IllegalArgumentException("enter a valid age");
        } else if (age<18) {
            throw new ArithmeticException("you can't vote as you age is lower than 18");

        } else{
            System.out.println("you can vode");
        }
    }

    public static void main(String[] args) {
        try{
            throw_class obj = new throw_class();
            obj.check(5);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
