package AdvancedJavaConcepts;

final class Animal{
    void display(){
        System.out.println("This is final class : ");
    }
}
public class Q9 {
    static void main(String[] args) {
        Animal A = new Animal();
        A.display();
    }
}