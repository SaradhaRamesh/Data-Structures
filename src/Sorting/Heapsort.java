package Sorting;

import java.util.*;

public class Heapsort {
static void heapSorting(int arr[],int n) {
	for(int step=n-1;step>0;step--)
	{
		
		int max_idx,t;
		max_idx=step;
		for(int i=step-1;i>=0;i--) {
			if(arr[i]>arr[max_idx]) {
				max_idx=i;
			}
		}
		t=arr[step];
		arr[step]=arr[max_idx];
		arr[max_idx]=t;
	}
}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n= s.nextInt();
		
		
		System.out.print("Enter the array elements one by one:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		heapSorting(arr,n);
		System.out.println("Sorted array:");
		printArray(arr,n);
		
	}

}
