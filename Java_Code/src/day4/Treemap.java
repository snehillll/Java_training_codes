package day4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
	
	public static void myHashMap() {
		// Map<Integer, String> map = new HashMap<Integer, String>();   		// unordered insertion
		//Map<Integer, String> map = new LinkedHashMap<Integer, String>();		// ordered insertion	
		Map<Integer, String> map = new TreeMap<Integer, String>();   			// sorted


		map.put(101, "praty");
		map.put(103, "snehil");
		map.put(102, "ayush");
		map.put(104, "hardik");

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "" + entry.getValue());
		}

	}
	
	public static void main(String[] args) {
		myHashMap();
	}

	

}