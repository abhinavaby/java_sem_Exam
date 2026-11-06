package module_1;
import java.util.Scanner;

class data{
    int age;
    String name;

    void display(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("data");
        System.out.println("age:"+age);
        System.out.println("name:"+name);

    }

}

public class class3 {
    public static void main(String[] args) {
        int a;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age :");
        a=sc.nextInt();
        System.out.println("enter name :");
        name=sc.next();
        data d = new data();
        d.display(a,name);
    }
}
