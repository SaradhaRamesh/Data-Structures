package Array;

import java.util.Scanner;

public class Adding_array_elements {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
		double avg=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.print("sum="+sum);
		avg=(double)sum/n;
		System.out.println("\nAverage="+avg);
	}

}
