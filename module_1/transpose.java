package module_1;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][] = new int[3][3];
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.println("enter the element at the index "+i+""+j);
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(a[j][i]+" ");

            }
            System.out.println(" ");
        }
    }
}
