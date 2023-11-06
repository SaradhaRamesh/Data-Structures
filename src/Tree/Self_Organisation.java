package Tree;

import java.util.Scanner;

public class Self_Organisation {
	private int[]list;
	private int[] count;
	private int size;
	
	  public Self_Organisation(int listSize)
	    {
	        list = new int[listSize];
	        count = new int[listSize];
	        size = 0;
	    }
	  public boolean isEmpty() {
		  return size == 0;
	  }
	  public boolean isFull() {
		  return size == list.length; 
	  }
	  public int getSize() {
		  return size;
	  }
	  public void insert(int val) {
		  if(isFull()) {
			  System.out.println("Error: List is Full");
			  return;
		  }
		  list[size]=val;
		  count[size]=0;
		  size++;
	  }		
	  public void remove(int pos)
	    {
	        pos--;
	        if (pos<0 || pos>=size) {
	            System.out.println("Invalid position ");
	            return;
	        }
	        for (int i=pos;i<size-1;i++) {
	            list[i]=list[i+1];
	            count[i]=count[i+1];
	        }
	        size--;
	    }
	  public boolean search(int x)
	    {
	        boolean searchResult = false;
	        int pos=-1;
	        for (int i=0;i<size;i++) {
	            if (list[i] == x) {
	                searchResult=true;
	                pos=i;
	                break;
	            }
	        }
	        if (searchResult) {
	            count[pos]++;
	            int c = count[pos];
	            for (int i=0;i<pos;i++) {
	                if (count[pos]>count[i]) {
	                    for (int j=pos;j>i;j--) {
	                        list[j]=list[j-1];
	                        count[j]=count[j-1];
	                    }
	                    list[i] = x;
	                    count[i] = c;
	                    break;
	                }
	            }
	        }
	        return searchResult;
	     }
	  public void printList()
	    {
	        System.out.print("\nList = ");
	        for (int i=0;i<size;i++)
	            System.out.print(list[i] + " ");
	        System.out.print("\nCount = ");
	        for (int i=0;i<size;i++)
	            System.out.print(count[i] + " ");
	    }
public static void main(String[] args) {
	Scanner s =new  Scanner(System.in);
	System.out.println("Self Organisation List\n");
	System.out.println("Enter size of the list");
	int size=s.nextInt();
	Self_Organisation list=new Self_Organisation(size);
	char  ch;
	do {
		System.out.println("Self Organizing List Operator:\n");
		System.out.println("1.Insert");
		System.out.println("2.delete at position");
		System.out.println("3.search");
		System.out.println("4.check empty");
		System.out.println("5.size");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter integer element to insert");
			list.insert(s.nextInt());
			break;
		case 2:
			System.out.println("Enter position  to delete");
			list.remove(s.nextInt());
			break;
		case 3:
			System.out.println("Enter integer element to search");
			System.out.println("search Result:"+list.search(s.nextInt()));
			break;
		case 4:
			System.out.println("Empty status="+list.isEmpty());
			break;
		case 5:
			System.out.println("Full status="+list.isFull());
			break;

		case 6:
			System.out.println("Size ="+list.getSize());
			break;
			default:
				System.out.println("Wrong Entry\n");

		}
		list.printList();
		System.out.println("\n Do you want to continue(Type Y or N)\n");
		ch=s.next().chartAt(0);
	}while(ch=='y'||ch=='Y');
}
 
	}


