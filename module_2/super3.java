package module_2;
class as{
    int i;
    int j;

    as(int i, int j){
        this.i=i;
        this.j=j;
        System.out.println("class 1");
    }

}
class bs extends as{
    int k;
    bs(int i, int j,int k){
        super(i,j);
        this.k=k;
        System.out.println("class 2");
    }
    void display(){
        System.out.println(i+","+j+","+k);
    }
}


public class super3 {
    public static void main(String[] args) {
        bs b =  new bs(1,2,3);
        b.display();
    }
}
