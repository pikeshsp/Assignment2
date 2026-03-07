package Module6;

public class Q4 {
    static int largest(int []  arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m ){
                m=arr[i];
            }
        }
        return m;
    }
    static void secondlargest(int max,int[] arr){
        int sl=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max && arr[i]>sl){
                sl=arr[i];
            }
        }
        System.out.println("Secong largest element:"+sl);
    }
    public static void main(String[] args) {
        int [] arr={1,2,34,32,45,75,78};
        int max=largest(arr);
        secondlargest( max, arr);

    }
}
