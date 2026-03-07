package Module7;

public class Q5 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        // Linear Search
        int linearIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                linearIndex = i;
                break;
            }
        }

        if(linearIndex != -1)
            System.out.println("Linear Search: Element found at index " + linearIndex);
        else
            System.out.println("Linear Search: Element not found");

        // Binary Search
        int left = 0;
        int right = arr.length - 1;
        int binaryIndex = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == key) {
                binaryIndex = mid;
                break;
            }
            else if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if(binaryIndex != -1)
            System.out.println("Binary Search: Element found at index " + binaryIndex);
        else
            System.out.println("Binary Search: Element not found");
    }
}
