package Module6;

import java.util.Arrays;

public class Q2 {
    static void reverse(int [] arr){
    int [] rev=new int [arr.length];
    int j=0;
    int n=arr.length-1;
    for(int i=n;i>=0;i--){
        rev[j]=arr[i];
        j++;
    }
    System.out.println(Arrays.toString(rev));
}
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        reverse(arr);
    }
}
