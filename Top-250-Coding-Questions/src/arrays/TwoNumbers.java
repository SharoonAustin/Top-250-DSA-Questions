package arrays;

import java.util.Arrays;
import java.util.HashMap;

class TwoNumbers{
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
        int result[]=new int[2];
        int j=0;
        
        for(int i=0; i<nums.length; i++){
            if(hmap.containsKey(target-nums[i])){
                result[0]=hmap.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            else{
                hmap.put(nums[i], j);
                j++;
            }            
        }
        return result;
    }
	
	public static void main(String[] args) {
		TwoNumbers t1=new TwoNumbers();
		int nums[]= {2, 7, 11, 15};
		
		System.out.print(Arrays.toString(t1.twoSum(nums, 9)));
	}
}