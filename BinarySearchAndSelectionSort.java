import java.util.Arrays;
import java.util.Random;
public class BinarySearchAndSelectionSort {
    public static void main(String[] args) {
        int[] Array = new int[15];
        Random rand = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(100);
        }

        int numToSearch = 101;
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(Array));
        
        selectionSort(Array);
        System.out.println("After sort:");
        System.out.println(Arrays.toString(Array));

        //linearSearch
        System.out.println("Return number index:");
        if (binarySearch(Array, numToSearch) != -1) {
            System.out.println(binarySearch(Array, numToSearch));
        } else {
            System.out.println("Cannot find number");
        }
    }

    //Search
    public static int binarySearch(int[] Array, int numToSearch) {
    int high = Array.length - 1;
    int low = 0;
    int mid = 0;
        while (high >= low) {
            mid = (high + low) / 2;
            if (Array[mid] > numToSearch) {
                high = mid - 1;
            } else if (Array[mid] < numToSearch) {
                low = mid + 1;
            } else {
                return mid;
            }
        } return -1;
    }

    //Sort
    public static void selectionSort(int[] Array) {

        for (int i = 0; i < Array.length - 1; i ++) {
            for (int j = i + 1; j < Array.length; j ++) {
                if (Array[j] < Array[i]) {
                    swap(Array, j, i);
                }
            }
        }
    }
    
    //Swap
    public static void swap(int[] Array, int a, int b) {
        int temp = Array[a];
        Array[a] = Array[b];
        Array[b] = temp;
    }
}
