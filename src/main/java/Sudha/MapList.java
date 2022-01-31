package Sudha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String>sname=new HashMap<Integer,String>();
		sname.put(1,"Rani");
		sname.put(2,"SiRaj");
		sname.put(3,"Rahul");
		 sname.put(4,"Ranjani");
		sname.put(5, "Rahul");
for(Map.Entry m:sname.entrySet()) {
		 System.out.println(m.getKey());
		System.out.println(m.getValue());

		Map<Integer, String> snames = new LinkedHashMap<Integer, String>();
		
		  snames.put(1,"Rani"); snames.put(2,"SiRaj"); snames.put(3,"Rahul");
		  snames.put(4,"Ranjani"); snames.put(5, "Rahul"); for(Map.Entry
		  lm:snames.entrySet()) { System.out.println(lm.getKey());
		  System.out.println(lm.getValue());
		 

		Map<Integer, String> snames1 = new TreeMap<Integer, String>();
		snames1.put(1, "Rani");
		snames1.put(2, "SiRaj");
		snames1.put(3, "Rahul");
		snames1.put(4, "Ranjani");
		snames1.put(5, "Rahul");
		for (Map.Entry tm : snames1.entrySet()) {
			System.out.println(tm.getKey());
			System.out.println(tm.getValue());
			
			
				}
		  
	}
}
	}
}
	
