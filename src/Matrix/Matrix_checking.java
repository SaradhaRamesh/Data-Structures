package Matrix;

import java.util.Scanner;

public class Matrix_checking {

	public static void main(String[] args) {
		
		int c1,r1,c2,r2,count=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter number of row for first matrix:");
		r1=s.nextInt();
		System.out.print("Enter number of col for first matrix:");
		c1=s.nextInt();
		System.out.print("Enter number of row for second matrix:");
		r2=s.nextInt();
		System.out.print("Enter number of col for second matrix:");
		c2=s.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		if(r1==r2 && c1==c2) {{
			System.out.print("Enter element of first matrix:");
			for(int i=0;i<r1;i++)
				for(int j=0;j<c1;j++) {
					a[i][j]=s.nextInt();
				}
		System.out.println();
	}
		
		System.out.print("Enter element of second matrix:");
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++) {
				a[i][j]=s.nextInt();
			}
	System.out.println();
	for(int i=0;i<r1;i++)
		for(int j=0;j<c1;j++) {
			if(a[i][j]!=b[i][j]) {
				count++;
				break;
			}
		}

		if(count==0)
			System.out.print("a matrix and b matrix are same");
		else
			System.out.print("a matrix and b matrix are not same");
	}

else
	System.out.print("Rows and cols are not same");
	}
}