package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PhoneDirectory {
public static void main(String[] args) {
	//Map<String,Long>m=new TreeMap<String,Long>();
	Map<String,Long>m=new Hashtable<String,Long>();
	
	m.put("shweta jadhav", 7830983663L);
	m.put("aishwarya gaikwad", 9864546637L);
	m.put("nikita jadhav", 7863453728L);
	m.put("gauri Jadhav", 7974645673L);
	
	
	
	long phNo=m.get("shweta jadhav");
	System.out.println("phone number of shweta jadhav:"+phNo);
	
	for(Entry<String, Long> e:m.entrySet()) {
		System.out.println((e));
		
	}
	
}
}
