class Shape {
    void info() { System.out.println("This is a shape"); }
}

class Circle extends Shape {
    void circle() { System.out.println("Circle"); }
}

class Rectangle extends Shape {
    void rectangle() { System.out.println("Rectangle"); }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.info(); c.circle();
        r.info(); r.rectangle();
    }
}
