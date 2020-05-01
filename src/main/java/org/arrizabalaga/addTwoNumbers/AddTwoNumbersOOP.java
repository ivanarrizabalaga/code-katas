package org.arrizabalaga.addTwoNumbers;

/**
 * A comprehensive approach where based on simple operations the exercise can be done.
 * Cons? There is overflow when dealing with big numbers.
 *
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class AddTwoNumbersOOP implements IAddTwoNumbers{
	@Override
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//Turn lists into Integers
		Integer l1Sum = toInteger(l1);
		Integer l2Sum = toInteger(l2);

		//Sum numbers
		Integer sum = l1Sum+l2Sum;

		//Turn result into ListNode
		return fromInteger(sum);
	}

	/**
	 * Turns a LisNode into an Integer
	 * @return
	 */
	protected Integer toInteger(ListNode listNode){
		Integer sum=0;
		Integer units=1;
		ListNode current = listNode;
		while(true){
			sum+=current.val*units;
			if(current.next!=null){
				current=current.next;
				units*=10;
			}else{
				break;
			}
		}
		return sum;
	}

	/**
	 * Turns an integer into a ListNode
	 * @param num
	 * @return
	 */
	protected ListNode fromInteger(Integer num){
		Integer left = num;
		ListNode previousNode=null;
		ListNode currentNode;
		ListNode root = null;

		while(true){
			Integer mod = left%10;
			left = left/10;
			currentNode = new ListNode(mod);

			if(previousNode==null){
				root = currentNode;
			}else{
				previousNode.next=currentNode;
			}
			previousNode=currentNode;

			if(left==0){
				break;
			}
		}
		return root;
	}
}
