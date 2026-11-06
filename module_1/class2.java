package module_1;

class box2{
    int length;
    int width;
    int height;

    double vol(int l , int h, int w){
        length=l;
        width=w;
        height=h;
        return length*width*height;
    }

}

public class class2 {
    static void main(String[] args) {
        box b = new box();



        System.out.println(b.vol(1,2,3));

    }

}