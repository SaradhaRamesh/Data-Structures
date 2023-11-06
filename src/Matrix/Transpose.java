package Matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,r,trace=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter number of row:");
		r=s.nextInt();
		System.out.print("Enter number of col:");
		c=s.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Transepose Matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[j][i]+" ");
				if(i==j) {
					trace+=a[i][j];
				}
		
			}
			
			System.out.println();
		}
		System.out.print("Trace="+trace);
	}

}
