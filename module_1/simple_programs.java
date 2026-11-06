package module_1;
import java.util.Scanner;


public class simple_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number : ");
        a=sc.nextInt();
        System.out.println("Enter number : ");
        b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }

        //or

        int greatest = a>b?a:b;
        System.out.println(greatest+" is greatest");

        // or

        System.out.println(a>b?a:b+" is greatest");
    }
}
