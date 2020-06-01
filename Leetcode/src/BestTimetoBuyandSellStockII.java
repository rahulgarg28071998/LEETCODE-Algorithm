import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class BestTimetoBuyandSellStockII {
public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	String s = "nbmn,kl";
	System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	int[] newarr = {0,1,0,0,1,0,1};
	System.out.println(findMaxLength(newarr));
	
}
public static boolean backspaceCompare(String S, String T) {
    Stack<Character> st = new Stack<Character>();
    for(int i = 0;i<S.length();i++)
    {
      if(S.charAt(i)=='#')
      {
    	  if(!st.isEmpty())
    		  st.pop();
      }
      else
      {
    	  if(!st.isEmpty()&&st.peek()=='#')
    		  st.pop();
    	  else
    		  st.push(S.charAt(i));
      }
    }
    String s = "";
    while(!st.isEmpty())
    {

    s=s+st.pop();	
    }
    for(int i = 0;i<T.length();i++)
    {
      if(T.charAt(i)=='#')
      {
    	  if(!st.isEmpty())
    		 st.pop();
      }
      else
      {
    	  if(!st.isEmpty()&&st.peek()=='#')
    		  st.pop();
    	  else
    		  st.push(T.charAt(i));
      }
    }
    String t = "";
    while(!st.isEmpty())
    {
    t=t+st.pop();	
    }
    
    //System.out.println(s+" "+t);
    return s.equals(t)? true : false;
}



public static int findMaxLength(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
            nums[i]=-1;
    }
    
    HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
        
        ArrayList<Integer> val = hm.getOrDefault(sum ,new ArrayList<Integer>() );
        val.add(i);
        hm.put(sum, val);
        System.out.println(i);
    }
    int max  = 0;
    for(Map.Entry<Integer, ArrayList<Integer>> en : hm.entrySet() )
    {
    	ArrayList<Integer> val = en.getValue();
    	//System.out.println(val.get(val.size()-1)-val.get(0));
    	
    	max = max<val.get(val.size()-1)-val.get(0)?val.get(val.size()-1)-val.get(0):max;
//    	System.out.println(en.getKey() +" "+ en.getValue());
    }
	return max;
}
}
