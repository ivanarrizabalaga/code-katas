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
}