package module_2;
class fact{
    int factt(int n){
        if(n==0 || n==1){
            return n;

        }
        else{
            return n*factt(n-1);

        }
    }
}
public class recursion_factorial {

    public static void main(String[] args) {
        fact f = new fact();
        int n = f.factt(4);
        System.out.println(n);
    }
}
