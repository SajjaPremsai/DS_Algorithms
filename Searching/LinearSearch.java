import java.util.Scanner;

public class LinearSearch {

    public static int Linear(int arr[] , int start , int end , int target){
        for(; start <= end ; start++){
            if(arr[start] == target)
                return start;
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
        int index = Linear(arr, 0, n - 1,target);
        if(index == -1){
            System.out.println("The Element " + target + " doesn't found in the Array");
        }
        else{
            System.out.println("The Element " + target + " found at the index " + (index+1));
        }
        }
}
