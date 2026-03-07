package Module6;

public class Q1 {
    static void maximum(int [] arr){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("Maximum element is :"+max);
}
    static void minimum(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is:"+min);
    }
    public static void main(String[] args) {
        int [] arr={1,2,45,67,21,48,18};
        maximum(arr);
        minimum(arr);
    }
}
