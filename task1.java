// Abstract class with an abstract method
abstract class Shape {
    abstract void draw();
}

// Concrete class extending the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Main class to instantiate and use the concrete class
public class Task1 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
