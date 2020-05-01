package org.arrizabalaga.addTwoNumbers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public abstract class AddTwoNumbersTest<T extends IAddTwoNumbers> {
	protected T sut;
	protected abstract T createSUT();

	@Before
	public void setup(){
		sut = createSUT();
	}

	@Test
	public void addingTwoLists_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(2,4,3));
		ListNode l2 = new ListNode(Arrays.asList(9,6,4));
		ListNode expectedList = new ListNode(Arrays.asList(1,1,8));

		//when
		ListNode addList = sut.addTwoNumbers(l1, l2);

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
		ListNode addList = sut.addTwoNumbers(l1,l2);

		//then
		assertThat(addList.toString(), is(expectedList.toString()));
	}


	@Test
	public void addingTwoListsofLargeNumbers_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(9));
		ListNode l2 = new ListNode(Arrays.asList(1,9,9,9,9,9,9,9,9,9));
		ListNode expectedList = new ListNode(Arrays.asList(0,0,0,0,0,0,0,0,0,0,1));

		//when
		ListNode addList = sut.addTwoNumbers(l1, l2);

		//then
		assertThat(addList.toString(), is(expectedList.toString()));
	}
	

}
