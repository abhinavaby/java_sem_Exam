package module_2;

class static3 {
    int rollno;
    String name;
    static String college = "MCS";

    static void change() {
        college = "SJCET";
    }

    static3(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        change();

        static3 s1 = new static3(111, "Karan");
        static3 s2 = new static3(222, "Aryan");
        static3 s3 = new static3(333, "Sonoo");

        s1.display();
        s2.display();
        s3.display();
    }
}
