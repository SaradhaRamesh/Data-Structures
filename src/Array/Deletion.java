package Array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				}
		System.out.println("Enter the position you want to Delete:");
		int pos=s.nextInt();
		//System.out.println("Enter the element  you want to insert:");
	//	int element=s.nextInt();
		int j=pos;
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}
		//arr[pos]=element;
		System.out.println("Array travese:");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
