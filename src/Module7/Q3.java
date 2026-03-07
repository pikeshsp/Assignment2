package Module7;

import java.util.Arrays;

public class Q3 {
    static void bubblesort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,45,6,-1,0,-65,34};
        bubblesort(arr);

    }
}
