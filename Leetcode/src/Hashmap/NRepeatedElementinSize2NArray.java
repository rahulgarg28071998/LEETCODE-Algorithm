package Hashmap;

import java.util.HashMap;

public class NRepeatedElementinSize2NArray {

	  public static int repeatedNTimes(int[] A) {
	     
		  int n = A.length/2;
		  HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		  for (int i = 0; i < A.length; i++) {
			int val = hm.getOrDefault(A[i], 0);
			if(val+1==n)
				return A[i];
			hm.put(A[i],val+1);
			
		}
		  return A[0];
	    }
	  
	  public static void main(String[] args) {
		System.out.println(repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
	}
}
