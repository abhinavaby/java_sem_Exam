package module_1;

class demo {
    // Added variable names: id and name
    private int id = 5;
    private String name = "Rohan";
    void setter(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("changed");
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class class4 {
    public static void main(String[] args) {
        demo d = new demo();
        d.setter(1,"Abhinav");
        d.display();

    }
}
