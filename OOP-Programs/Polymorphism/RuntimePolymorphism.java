class Shape {
    void area() { System.out.println("Area not defined"); }
}

class Circle extends Shape {
    void area() { System.out.println("Circle area"); }
}

class Square extends Shape {
    void area() { System.out.println("Square area"); }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(); s.area();
        s = new Square(); s.area();
    }
}
