package module_2;

class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    void display() {
        System.out.println("Box: Length = " + length +
                ", Width = " + width +
                ", Height = " + height +
                ", Volume = " + volume());
    }
}

class Cube extends Box {

    Cube(double side) {
        super(side, side, side);
    }

    double volume() {
        return length * length * length;
    }

    void display() {
        System.out.println("Cube: Side = " + length +
                ", Volume = " + volume());
    }
}

public class test {
    public static void main(String[] args) {

        Box b = new Box(10, 5, 4);
        Cube c = new Cube(5);

        b.display();
        c.display();
    }
}