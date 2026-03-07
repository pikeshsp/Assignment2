package Module7;

import java.util.Arrays;

public class Q4 {
    static void selectionsort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={2,4,36,56,78,6,9};
        selectionsort(arr);
    }
}
