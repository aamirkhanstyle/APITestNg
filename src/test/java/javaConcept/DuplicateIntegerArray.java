package javaConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateIntegerArray {
	public static void main(String[] args) {
		
	

	
	int[] s= {1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,58,8,8,8,6};
	
	
	
	
	
	Map<Integer,Integer> storemap=new HashMap<Integer, Integer>();

	
	for(Integer test:s) {
		if(storemap.containsKey(test)) {
			storemap.put(test, storemap.get(test)+1);
			}
			else {
				storemap.put(test, 1);
			}
		
	}
	Set<Entry<Integer,Integer>>  entry=storemap.entrySet();
	for(Entry<Integer, Integer> e:entry) {
		
		if(e.getValue()>1) {
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
	}
	
}
	
	
}
