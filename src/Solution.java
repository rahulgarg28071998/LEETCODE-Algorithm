import java.awt.image.SinglePixelPackedSampleModel;
import java.util.HashSet;

public class Solution {
	public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i : nums)
        {
            if(hs.contains(i))
                hs.remove(i);
            else
                hs.add(i);
        }
        
		return (int) hs.toArray()[0];
        
        
    }
	
	static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + (n % 10)*(n%10); 
            n = n/10; 
        } 
    System.out.println(sum);  
    return sum; 
    } 
	public static boolean isHappy(int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int sum= n;
		while(sum!=1)
		{
			if(sum==0)
				return false;
			sum = getSum(sum);
			
			if(hs.contains(sum))
				return false;
			hs.add(sum);
			
		}
		if(sum==1)
			return true;
		return false;
        
    }
	
	public static void main(String[] args) {
		int aarr[] = {1,1,1,1,2};
		singleNumber(aarr);
		
		System.out.println(isHappy(11));
	}
}
