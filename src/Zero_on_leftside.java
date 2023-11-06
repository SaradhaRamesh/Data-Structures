import java.util.Scanner;

public class Zero_on_leftside {
    public static void segregateZerosAndOnes(int[] arr) {
        int left = 0; // Pointer for the left side of the array
        int right = arr.length - 1; // Pointer for the right side of the array

        while (left < right) {
            // Move the left pointer to the right until a 1 is found
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left until a 0 is found
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap the 0 at the left pointer with the 1 at the right pointer
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

	public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        segregateZerosAndOnes(arr);
        
        System.out.println("\nArray after segregating 0s and 1s:");
        for (int num : arr) {
            System.out.print(num + " ");
        		}
			}
}