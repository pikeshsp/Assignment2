package Module7;

public class Q1 {
    static boolean linear (int target,int [] arr) {
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found =true;
            }
            else{
                found=false;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,45,67,8,98};
        int target=98;
        if(linear(target,arr)){
            System.out.println("target present");
        }
        else{
            System.out.println("target not present");
        }
    }
}
