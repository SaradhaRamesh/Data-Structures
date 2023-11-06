package Collection;

import java.util.ArrayList;

public class Example2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("sara");
		alist.add("madhu");
		alist.add("santho");
		alist.add("gokul");
		alist.add("gopika");
		alist.add("karthi");
		//System.out.println(alist);
		alist.remove("gopika");
		alist.remove("sara");
		//System.out.println(alist);
		alist.remove(2);
		//System.out.println(alist);
		//for(String str:alist)
			//System.out.println(str);
	//System.out.println(	"ArrayList size:" +alist.size());
	@SuppressWarnings("rawtypes")
	ArrayList  list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add("gopika");
	list.add("karthi");

	//System.out.println(alist);
	//list.remove("gopika");
	//list.remove("sara");
	//System.out.println(alist);
	//alist.remove(2);
	System.out.println(list);
	//for(String str:list)
		System.out.println(list);
//System.out.println(	"ArrayList size:" +alist.size());

	}

}
