package org.arrizabalaga.twoSum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class TwoSumTest {

	private TwoSum twoSum = new TwoSum();

	@Test
	public void basicExample(){
		//given
		int[] nums = new int[]{2,7,11,15};
		int target =9;

		//expect
		assertThat(twoSum.twoSum(nums, target), is(new int[]{0,1}));
	}

}