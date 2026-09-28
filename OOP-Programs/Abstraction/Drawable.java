interface Drawable {
    void draw();
    void resize();
}

class Rectangle implements Drawable {
    public void draw() { System.out.println("Draw rectangle"); }
    public void resize() { System.out.println("Resize rectangle"); }
}

public class Drawable {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        r.resize();
    }
}
