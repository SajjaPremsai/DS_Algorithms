import java.util.Scanner;

class Merge {
    public static void MergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);
            MergeArr(arr, start, mid, end);
        }
    }

    public static void MergeArr(int arr[], int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; ++i)
            leftArr[i] = arr[start + i];
        for (int j = 0; j < rightSize; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = start;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightSize) {
            arr[k++] = rightArr[j++];
        }
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
        MergeSort(arr, 0, n - 1);
        System.out.println("After Sorting Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
