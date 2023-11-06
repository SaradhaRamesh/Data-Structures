package Array;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				}
		System.out.println("Enter the position you want to Update:");
		int pos=s.nextInt();
		System.out.println("Enter the element  you want to Update:");
		int element=s.nextInt();
		arr[pos-1]=element;
		System.out.println("Array travese:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
