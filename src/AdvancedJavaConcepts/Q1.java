package AdvancedJavaConcepts;

abstract class Shape {
    abstract void display();
}
class Circle extends Shape {
    @Override
    void display() {
        System.out.println(" This is a Circle ");
    }
}
public class Q1{
    static void main(String[] args) {
        Circle C = new Circle();
        C.display();
    }
}
