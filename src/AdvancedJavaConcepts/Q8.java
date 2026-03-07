package AdvancedJavaConcepts;

public class Q8 {
    static void main(String[] args) {
        String S = " Hello ";
        S = S + " World ";
        System.out.println(" String : " + S );

        StringBuilder SB = new StringBuilder(" Sapthigiri ");
        SB.append(" College ");
        System.out.println(" StringBuilder : " + SB );

        StringBuffer SBF = new StringBuffer(" Department ");
        SBF.append(" HRD ");
        System.out.println("StringBuffer : " + SBF);
    }
}
