import java.util.*;
public class Smallest_missing_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Input array elements
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        boolean foundNonRepeated = false;

        // Print non-repeated elements
        System.out.println("The elements are:");
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                System.out.println(num);
                foundNonRepeated = true;


	}

}
	}
}