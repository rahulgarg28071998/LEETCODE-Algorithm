package Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class JewelsandStones {

	 public static int numJewelsInStones(String J, String S) {
	        HashSet<Character> hs1 = new HashSet<Character>();
	        HashMap<Character,Integer> hs2 = new HashMap<Character,Integer>();
	        
	        
	        for(int i=0;i<J.length();i++)
	        	hs1.add(J.charAt(i));
	        for(int i=0;i<S.length();i++)
	        {
	        	int val = hs2.getOrDefault(S.charAt(i), 0);
	        	hs2.put(S.charAt(i),val+1);
	        }
	        int ans = 0;
	        for(char c : hs1)
	        {
	        	ans+=hs2.getOrDefault(c, 0);
	        }
	        
	        return ans;
	    }
	 
	 
	 public int[] smallerNumbersThanCurrent(int[] nums) {
	      
		 Arrays.sort(nums);
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 for (int i = 0; i < nums.length; i++) {
			int val = hm.getOrDefault(nums[i],0);
			hm.put(nums[i], val+1);
		}
		 int ans[] = new int[nums.length];
		 
		 for (int i = 0; i < nums.length; i++) {
			
		}
		 return ans;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAABBB"));
	}
}
