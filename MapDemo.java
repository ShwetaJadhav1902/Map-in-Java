package map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		//Map<Integer,String> m=new HashMap();
		//Map<Integer,String> m=new TreeMap();
		Map<Integer,String> m=new Hashtable();
		m.put(101,"Shweta");
		m.put(102,"Aishu");
		m.put(102,"niks");
		m.put(104,"Gauri");
		
		for(Entry<Integer,String>map:m.entrySet()) {
			//System.out.println(map);
			System.out.println(map.getKey());
		}
		System.out.println(m.get(102));
	}

}
