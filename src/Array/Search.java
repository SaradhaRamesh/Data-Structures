package Array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n+1];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				}
		//System.out.println("Enter the position you want to insert:");
		//int pos=s.nextInt();
		System.out.println("Enter the element  you want to search:");
		int search=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				count++;
				System.out.printf("Element %d found at position:%d\n",search,i+1);
			}
		}
		if(count==0)
			System.out.printf("Search element not present");
		

	}

}
