package org.arrizabalaga.addTwoNumbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class ListNodeTest {
	@Test
	public void constructListNodeList(){
		//given
		List<Integer> sampleData = Arrays.asList(1,2,3);

		//when
		ListNode listNode = new ListNode(sampleData);

		//then
		assertThat(listNode.toString(),is("1 -> 2 -> 3"));
	}

	@Test
	public void constructLargeListNode(){
		//given
		List<Integer> sampleData = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);

		//when
		ListNode listNode = new ListNode(sampleData);

		//then
		assertThat(listNode.toString(),is("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9"));
	}
}