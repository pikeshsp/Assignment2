package Module6;

import java.util.Arrays;

public class Q5 {
    static void missing(int [] arr){
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=arr[i-1]+1;
                m=arr[i];
            }
        }
        System.out.println("Missing element is:"+m);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,0,6,7,8};
        missing(arr);
    }
}
