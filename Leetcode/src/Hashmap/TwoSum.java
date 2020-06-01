package Hashmap;

import java.util.HashSet;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int ar[] = new int[2];
        for(int i =0 ; i<nums.length;i++)
        {
        	int temp = target - nums[i]; 
        	  
            // checking for condition 
            if (hs.contains(temp)) { 
                ar[0]=nums[i];
                ar[1]=temp;
            } 
            hs.add(nums[i]); 
            
        }
        
        return ar; 
    }
    
    
public static int lengthOfLongestSubstring(String s) {
     
	HashSet<Character> hs = new HashSet<Character>();
	int j =-1, i=0,max = 1;
	while(i<s.length())
	{
	while(!hs.contains(s.charAt(i))&&i<s.length())
		{
			i++;
			hs.add(s.charAt(i));
			System.out.println("KKKKKKKKK");
		}
	max = max<(i-j)?max:(i-j);
	
	while(hs.contains(j)&&j<i)
	{
		j++;
		hs.remove(s.charAt(i));
		System.out.println("LLLLL");
	}
	
	max = max<(i-j)?max:(i-j);
	}
	return max;
	
    }



public static void main(String[] args) {
	System.out.println(lengthOfLongestSubstring("bbbbb"));
}
}
