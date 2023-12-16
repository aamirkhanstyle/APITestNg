package javaConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateArrayString {
	
	
public static void main(String[] args) {
		
		String[] s= {"my", "name"," is"," aamir"," and"," name"," is"," aamir"};
		
		
		
		
		
		Map<String,Integer> storemap=new HashMap<String, Integer>();
		
		for(String test:s) {
			if(storemap.containsKey(test)) {
				storemap.put(test, storemap.get(test)+1);
				}
				else {
					storemap.put(test, 1);
				}
			
		}
		Set<Entry<String,Integer>>  entry=storemap.entrySet();
		for(Entry<String, Integer> e:entry) {
			
			if(e.getValue()>1) {
				System.out.println(e.getKey()+""+e.getValue());
			}
			
		}
		
	}

}
