package module_1;

class box{
    int length;
    int width;
    int height;

    double vol(int a,int b,int c){
        length=a;
        width=b;
        height=c;

        return length*width*height;
    }

}

public class clas1 {
    public static void main(String[] args) {
        box b = new box();



        System.out.println(b.vol(1,2,3));

    }

}
