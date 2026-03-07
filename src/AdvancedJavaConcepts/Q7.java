package AdvancedJavaConcepts;

public class Q7 {
    static void main(String[] args) {
        Q7 c = new Q7();
        c = null;
        System.gc();
        System.out.println(" GC REQUESTED ");
    }
}
