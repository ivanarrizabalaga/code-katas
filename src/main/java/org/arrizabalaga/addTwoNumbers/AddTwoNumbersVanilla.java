package org.arrizabalaga.addTwoNumbers;

/**
 * A straighforward implementation.
 * Cons? Far more 'algorithmic' than the oop apporach.
 * Pros? Quicker, no overflow
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class AddTwoNumbersVanilla implements IAddTwoNumbers {
	@Override
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//Precondition: any empty then the other
		if(l1==null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}

		ListNode root = null;
		ListNode current1 = l1;
		ListNode current2 = l2;
		ListNode sumNode;
		ListNode previousSumNode=null;
		int carried = 0;

		while(current1!=null || current2!=null || carried>0){
			int value1 = current1!=null?current1.val:0;
			int value2 = current2!=null?current2.val:0;
			//calculate new val
			int sum = value1+value2+carried;
			if(sum>=10){
				carried = 1;
				sum = sum%10;
			}else{
				carried=0;
			}
			//create new node
			sumNode = new ListNode(sum);

			//link list
			if(previousSumNode==null){
				root=sumNode;
			}else{
				previousSumNode.next=sumNode;
			}
			previousSumNode=sumNode;

			//more loops?
			current1=current1!=null?current1.next:null;
			current2=current2!=null?current2.next:null;
		}

		return root;
	}
}
