import java.util.Scanner;

public class Non_reapting {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		for(int j=i+1;j<n;j++){
			int temp=arr[i];
			if(temp!=arr[j]) {
				//System.out.println(temp);
				count++;
			break;
			}
			if(count==0)
			System.out.println(temp);
		}
		
	}

}
