package Sudha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionAlistLnkList {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		 List<String> sname=new ArrayList<String>();
		 sname.add("Rani");
		 sname.add("SiRaj");
		 sname.add("Rahul");
		 sname.add("Ranjani");
		 sname.add("Rahul");
		// Iterator itr=(Iterator) sname.iterator();
		// while(itr.hasnext()) {
		 //ystem.out.println(itr.next());
		 sname.remove(3);
		 sname.add("Rex");
		 sname.forEach(System.out::println);
		 sname.stream().map(String::toUpperCase).forEach(System.out::println);
		 sname.stream().map(String::toLowerCase).forEach(System.out::println);

		List<String> snames = new LinkedList<String>();
		snames.add("Rani");
		snames.add("SiRaj");
		snames.add("Rahul");
		snames.add("Ranjani");
		snames.add("Rahul");
		snames.add("Sangeetha");
		snames.remove(2);
		//snames.remove(6);
		snames.forEach(System.out::println);


	}
}
