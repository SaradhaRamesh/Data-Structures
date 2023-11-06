package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("HCL");
	list.add("DELL");
	list.add("CTS");
	list.add("TCS");
	list.add("TECH Mahindra");
	list.add(2,"Zoho");
	list.set(1,"Imarticus");
	list.clear();
	list.forEach(System.out::println);
	System.out.println(list.indexOf("Imarticus"));
	System.out.println(list.get(3));
	System.out.println(list.size());
	System.out.println(list.contains("Imarticus"));
	System.out.println(list.contains("hello"));
	//Collections.sort(list);
	//list.forEach(System.out::println);
	for(String str:list)
		System.out.println(str);
}
}
