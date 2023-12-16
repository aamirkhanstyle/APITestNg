package javaConcept;

import java.util.Arrays;

public class SecondLargest1 {

	public static void main(String[] args) {
		int[] t= {5,6,2,3,9};
		
		int l=t.length;
		System.out.println(l);
		
		
		Arrays.sort(t);
	
		System.out.println(t[l-2]);
		
	}

	
}
