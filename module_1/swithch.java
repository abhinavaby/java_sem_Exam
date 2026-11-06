package module_1;
import java.util.Scanner;

public class swithch {
    public static void main(String[] args) {
     try{
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the number(1-3) : ");
            int num = sc.nextInt();
            switch(num){
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                default :
                    System.out.println("wrong choice");
                    break;

                 }
    }
    catch(Exception e){
     System.out.println(e);}
    }

}
