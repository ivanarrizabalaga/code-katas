package org.arrizabalaga.addTwoNumbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ivan@zapiens.org">Ivan Arrizabalaga</a>
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
	public void whenToInteger_thenSumsValues(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(2,4,3));

		//when
		Integer sum = l1.toInteger();

		//then
		assertThat(sum, is(342));
	}

	@Test
	public void whenFromInteger_thenListNodeAsExpected(){
		//given
		Integer value = 423;

		//when
		ListNode listNode = ListNode.fromInteger(value);

		//then
		assertThat(listNode.toString(), is("3 -> 2 -> 4"));
	}

	@Test
	public void addingTwoLists_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(2,4,3));
		ListNode l2 = new ListNode(Arrays.asList(5,6,4));
		ListNode expectedList = new ListNode(Arrays.asList(7,0,8));

		//when
		ListNode addList = l1.sum(l2);

		//then
		assertThat(addList.toString(), is(expectedList.toString()));
	}

	@Test
	public void addingTwoListsofZeros_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(0));
		ListNode l2 = new ListNode(Arrays.asList(0));
		ListNode expectedList = new ListNode(Arrays.asList(0));

		//when
		ListNode addList = l1.sum(l2);

		//then
		assertThat(addList.toString(), is(expectedList.toString()));
	}


	@Test(expected = ArithmeticException.class)
	public void addingTwoListsofLargeNumbers_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(9));
		ListNode l2 = new ListNode(Arrays.asList(1,9,9,9,9,9,9,9,9,9));
		ListNode expectedList = new ListNode(Arrays.asList(0,0,0,0,0,0,0,0,0,0,1));

		//when
		ListNode addList = l1.sum(l2);

		//then
		throw new ArithmeticException("Integer overflow");
	}

}