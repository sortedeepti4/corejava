package collectionFramework;
import java.util.ArrayList;
import java.util.List;

public class Listexample {
	
public static void main(String[] args) {
	
	List<Object> list = new ArrayList<Object>();
	list.add("raja");
	list.add(30.50f);
	list.add("raja");
	list.add('c');
	list.add('c');
	list.add(null);
	list.add(2,60);
	
	System.out.println("list"+list);
	System.out.println("===========");
	
	
	List listone = new ArrayList();
	listone.add("deepti");
	listone.addAll(list);
System.out.println("listone"+listone);
	listone.add(45);
	System.out.println(listone);
	System.out.println("===========");
	
	
	List listtwo = new ArrayList();
	listtwo.add(50);
	listtwo.add("raja");
	listtwo.addAll(listone);
	System.out.println("listtwo"+listtwo);
	listtwo.clear();
	System.out.println(listtwo);
	listtwo.add("cccc");
	System.out.println(listtwo);
	System.out.println("==============");
	
	
	//ArrayList is predefine class,have dynamic memory.
	System.out.println("ArrayList");
	ArrayList arraylist = new ArrayList();
	arraylist.add("one");
	arraylist.add("two");
	System.out.println(arraylist);
	
	
	ArrayList arraylistone = new ArrayList();
	arraylistone.add("three");
	arraylistone.add(null);
	arraylistone.add(0,"five");
	arraylistone.addAll(arraylist);
	System.out.println(arraylistone);
	
	
}

}
