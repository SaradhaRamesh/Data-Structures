package Sorting;

import java.util.Scanner;

public class Selection_sort {
static void selection_sorting(int arr[],int n) {
	for(int i=0;i<n-1;i++) {
		int small=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[small])
				small=j;
				}
		int temp=arr[small];
		arr[small]=arr[i];
		arr[i]=temp;
}
}
static void print(int arr[],int n) {
	for(int i:arr)
		System.out.print(i+ " ");
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			}
		selection_sorting(arr,n);
		print(arr,n);
		
		}

}
