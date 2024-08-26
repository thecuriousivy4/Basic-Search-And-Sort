import java.util.Arrays;
import java.util.Random;
public class LinearSearchAndSelectionSort {
    public static void main(String[] args) {
        int[] Array = new int[15];
        Random rand = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(100);
        }

        int numToSearch = Array[13];
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(Array));
        
        selectionSort(Array);
        System.out.println("After sort:");
        System.out.println(Arrays.toString(Array));

        //linearSearch
        System.out.println("Return number index:");
        
        if (linearSearch(Array, numToSearch) != -1) {
            System.out.println(linearSearch(Array, numToSearch));
        } else {
            System.out.println("Cannot find number");
        }
    }

    //Search
    public static int linearSearch(int[] Array, int numToSearch) {
        for (int i = 0; i < Array.length; i ++) {
            if (Array[i] == numToSearch) {
                return i;
            } 
        }
        return -1;
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
