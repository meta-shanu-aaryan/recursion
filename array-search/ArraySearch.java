class ArrSearch {
    public int linearSearch(int[] arr, int index, int n) {
        if (index == arr.length) {
            return -1;
        } else if (arr[index] == n) {
            return index;
        } else {
            return linearSearch(arr, index + 1, n);
        }
    }

    public int binarySearch(int[] arr, int left, int right, int n) {
        int mid = left + (right - left) / 2;
        if (left > right) {
            return -1;
        }
        if (arr[mid] == n) {
            return mid;
        } else {
            if (arr[mid] > n) {
                return binarySearch(arr, left, mid - 1, n);
            } else {
                return binarySearch(arr, mid + 1, right, n);
            }
        }
    }
}

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 6, 0 };

        int[] arr2 = { 0, 1, 4, 6, 9, 12 };
        ArrSearch as = new ArrSearch();

        System.out.println(as.linearSearch(arr, 0, 8));

        System.out.println(as.binarySearch(arr2, 0, 5, 5));
    }
}
