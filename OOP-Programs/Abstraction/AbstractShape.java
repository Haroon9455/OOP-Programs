abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing circle"); }
}

public class AbstractShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
