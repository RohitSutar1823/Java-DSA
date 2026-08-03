public class Insertion_Sort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = i;
            int currentValue = arr[i];
            int prev = i - 1;

            // shifting
            while ((prev >= 0) && currentValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // ab humare paas ek khaali jagah aa chuki h
            // place the currentValue
            arr[prev + 1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 1, 3 };
        insertionSort(arr);
        System.out.println("Printing the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
