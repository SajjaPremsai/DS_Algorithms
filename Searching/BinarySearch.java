import java.util.Scanner;

class BinarySearch {

    public static int Binary(int arr[] , int start , int end , int target){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                Binary(arr, start, mid-1, target);
            }
            else{
                Binary(arr, mid+1, end, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for the index " + (i + 1)  + " ");
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the Target value to search in the array : ");
        int target = obj.nextInt();
        int index = Binary(arr, 0, n - 1,target);
        if(index == -1){
            System.out.println("The Element " + target + " doesn't found in the Array");
        }
        else{
            System.out.println("The Element " + target + " found at the index " + (index+1));
        }
        }
}    
