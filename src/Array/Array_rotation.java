package Array;

import java.util.Scanner;

public class Array_rotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
				
		int x= arr[n-1];
		for(int i=n-1;i>0;i--) 
			arr[i]=arr[i-1];
			arr[0]=x;
		System.out.print("Rotate array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
