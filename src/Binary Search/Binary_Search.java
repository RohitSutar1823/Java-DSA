public class Binary_Search {

    public static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            // compare target with midValue
            if (arr[mid] == target) {
                // target found
                return mid;
            } else if (target > arr[mid]) {
                // go to right side
                start = mid + 1;
            } else {
                // target < arr[mid]
                end = mid - 1;
            }
            // update mid
            mid = (start + end) / 2;
        }
        // agar app yaha tk aagye h, iska mtlb hai
        // target not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 5));
    }
}
