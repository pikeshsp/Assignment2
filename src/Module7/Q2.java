package Module7;

public class Q2 {
    static boolean binarysearch(int target ,int [] arr){
        boolean found=false;
        int start=0;
        int last =arr.length-1;
        while(start<last){
            int mid=start+(last-start)/2;
            if(arr[mid]==target){
                found =true;
                break;
            }
            else if(arr[mid]>target){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,55,65,15};
        int target =4;
        if(binarysearch(target,arr)){
            System.out.println("Target present");
        }
        else{
            System.out.println("target not present");
        }
    }
}

