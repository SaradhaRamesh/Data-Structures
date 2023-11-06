package Sorting;

import java.util.Scanner;

public class Number_rotation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n]; 
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
					
			}
		System.out.println("The contents of the array before rotation are");
		for(int i:a)
			System.out.print(i+ " ");

		System.out.println("\nEnter the number by which the array elements are to be rotated");
		int count=s.nextInt();
		
		for(int j=0;j<=count;count++) {
		
			int temp=a[j];
			for(int i=1;i<n;i++) {
			a[i-1]=a[i];
			
			
		}
			a[n-1]=temp;
		}
		System.out.println("\nThe contents of the array after rotation are");
for(int i:a)
		System.out.print(i+ " ");
	}


	}

