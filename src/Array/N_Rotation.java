package Array;

import java.util.Scanner;

public class N_Rotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rot,r;
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elemnets");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
			System.out.print("Enter how many time to rotate:");
			rot=s.nextInt();
			for(r=0;r<=rot;r++) {	
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

}
