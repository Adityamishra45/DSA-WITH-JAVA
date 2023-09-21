package Polymorphism;x
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square2 = new Square(); // same as above

        shape.area();  // area is the common in all and we are
        circle.area(); // Representing the same thing in the multiple ways.
        square.area(); // So it is known as Polymorphism.
    }
}
