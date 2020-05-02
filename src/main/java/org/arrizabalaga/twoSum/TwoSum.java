package org.arrizabalaga.twoSum;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> mem = new HashMap();
		for(int i=0;i<nums.length;i++){
			int valueI = nums[i];
			Integer index0 = mem.get(valueI);
			if(index0!=null){
				return new int[]{index0,i};
			}else{
				mem.put(target-valueI, i);
			}
		}
		return null;
	}
}