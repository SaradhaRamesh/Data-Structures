package Sorting;

import java.util.Scanner;

public class Bubble_sorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temp=1;
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
	for(int step=0;step<n-1;step++) 
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]>arr[i+1]) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}

}
