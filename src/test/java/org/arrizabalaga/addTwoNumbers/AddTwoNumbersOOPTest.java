package org.arrizabalaga.addTwoNumbers;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class AddTwoNumbersOOPTest extends AddTwoNumbersTest{

	private AddTwoNumbersOOP addTwoNumbersOOP=new AddTwoNumbersOOP();

	@Override
	protected IAddTwoNumbers createSUT() {
		return addTwoNumbersOOP;
	}

	@Test
	public void whenToInteger_thenSumsValues(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(2,4,3));

		//when
		Integer sum = addTwoNumbersOOP.toInteger(l1);

		//then
		assertThat(sum, is(342));
	}

	@Test
	public void whenFromInteger_thenListNodeAsExpected(){
		//given
		Integer value = 423;

		//when
		ListNode listNode = addTwoNumbersOOP.fromInteger(value);

		//then
		assertThat(listNode.toString(), is("3 -> 2 -> 4"));
	}

	@Test(expected = ArithmeticException.class)
	public void addingTwoListsofLargeNumbers_thenMakesTheSum(){
		//given
		ListNode l1 = new ListNode(Arrays.asList(9));
		ListNode l2 = new ListNode(Arrays.asList(1,9,9,9,9,9,9,9,9,9));
		ListNode expectedList = new ListNode(Arrays.asList(0,0,0,0,0,0,0,0,0,0,1));

		//when
		ListNode addList = addTwoNumbersOOP.addTwoNumbers(l1, l2);

		//then
		throw new ArithmeticException("Integer overflow");
	}


}