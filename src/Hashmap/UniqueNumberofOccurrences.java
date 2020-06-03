package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class UniqueNumberofOccurrences {
	
	 public static boolean uniqueOccurrences(int[] arr) {
	        
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 
		 for (int i = 0; i < arr.length; i++) {
			int val = hm.getOrDefault(arr[i], 0);
			hm.put(arr[i],val+1);
			
		}
		 HashSet<Integer> hs = new HashSet<Integer>();
		 for(Entry<Integer, Integer> e : hm.entrySet())
		 {
			 if(hs.contains(e.getValue()))
				 return false;
			 hs.add(e.getValue());
		 }
		 return true;
	    }
	 
	 
public static void main(String[] args) {
	System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
}
}
