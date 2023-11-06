package Collection;

import java.util.Scanner;

public class Finding_Element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		System.out.print("Enter no.of elements you want in array:");
		int n=s.nextInt();
		System.out.println("Enter all the Elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();	
	}
		System.out.print("Enter the element you want to find:");
		int f=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==f) {
				System.out.print(i+1);
			count++;
			}
		}
if(count==0)

	System.out.print("Element not found");

}
}