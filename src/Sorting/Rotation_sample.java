package Sorting;

import java.util.Scanner;

public class Rotation_sample {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
					
			}
		int temp=a[n-1];
		for(int i=0;i<n-1;i++) {
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
		}
for(int i:a)
		System.out.print(i+ " ");
	}

}
