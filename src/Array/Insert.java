package Array;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n+1];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				}
		System.out.println("Enter the position you want to insert:");
		int pos=s.nextInt();
		System.out.println("Enter the element  you want to insert:");
		int element=s.nextInt();
		int j=n;
		while(j>pos) {
			arr[j]=arr[j-1];
			j--;
		}
		arr[pos]=element;
		System.out.println("After insertion:");
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
