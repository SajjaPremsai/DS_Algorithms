import java.util.Scanner;
class Quick{
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the Size of the Array : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i < n ; i++)
            arr[i] = in.nextInt();
        System.out.println("Array Elements are : ");
        for(int i:arr)
            System.out.print(i + " ");
        QuickSort(arr,0,n-1);
        System.out.println("Array After Sorted : ");
        for(int i : arr)
            System.out.print(i + " ");
    }

    private static void QuickSort(int[] arr, int start, int end) {
        int i = start, j = end-1,pivot = end;
        if(i < j){
            while(arr[i] < arr[pivot])
            {   
                i ++;
            }
            while(arr[j] > arr[pivot]){
                j++;
            }
            if(i < j)
               {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            else{
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }

            QuickSort(arr, start, j-1);
            QuickSort(arr, j+1, end);
        }   
    }
}