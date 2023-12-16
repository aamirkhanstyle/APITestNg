package javaConcept;

public class SecondLargest2 {
	
	
	public static void main(String[] args) {
		
		
		
		int[] t= {5,6,2,3,9,1,4,1,7};
		
		int l=t.length;
		System.out.println(l);
		int temp  ;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(t[i]>t[j]) {
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
				
			}
		}
		System.out.println(t[l-2]);	
		

	}


}
