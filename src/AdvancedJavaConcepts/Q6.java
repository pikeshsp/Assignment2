package AdvancedJavaConcepts;

public class Q6 {

    static String Department = " Placement ";
    String Name;
    int USN;

    Q6(String N , int U ){
        this.Name = N;
        this.USN = U;
    }
    static void displayDepartment(){
        System.out.println("Department : " + Department);
    }
    void display(){
        System.out.println("Name : " + Name + " ,  USN  : " + USN + " , Department : " + Department );
    }

    static void main(String[] args) {
        Q6 s1 = new Q6("Nitin",80);
        Q6 s2 = new Q6("Pikesh",86);

        Q6.displayDepartment();
        s1.display();
        s2.display();
    }

}
