package AdvancedJavaConcepts;

interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println(" Car ");
    }
}
public class Q2 {
    static void main(String[] args) {
        Car C = new Car();
        C.start();
    }
}
