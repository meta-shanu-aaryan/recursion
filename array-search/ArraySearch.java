import java.util.InputMismatchException;
import java.util.Scanner;

class ArrSearch {

    /**
     * Finds the number in an array and returns the index of it else -1
     * 
     * @param arr   Array on which Search operation is to be performed
     * @param index to be initialize as 0 to search from beginning
     * @param n     The number to be find
     * @return index if the element is found else -1
     */
    public int linearSearch(int[] arr, int index, int n) {
        try {
            if (index == arr.length) {
                return -1;
            } else if (arr[index] == n) {
                return index;
            } else {
                return linearSearch(arr, index + 1, n);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /**
     * Finds the number in an array and returns the index of it else -1
     * 
     * @param arr   Array on which Search operation is to be performed
     * @param left  Initializes as 0
     * @param right Initializes as size -1 of array
     * @param n     The number to search
     * @return index if found else -1
     */
    public int binarySearch(int[] arr, int left, int right, int n) {
        try {
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

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrSearch as = new ArrSearch();

        try {
            System.out.print("Enter the size of array ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int found = as.linearSearch(arr, 0, 8);

            if (found == -1) {
                System.out.println("Not Found");
            } else {
                System.out.println("Found at index " + found);
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter Integer Value only");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
