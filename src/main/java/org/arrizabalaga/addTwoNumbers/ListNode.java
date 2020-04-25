package org.arrizabalaga.addTwoNumbers;

import java.util.List;

/**
 * @author <a href="mailto:ivan@zapiens.org">Ivan Arrizabalaga</a>
 */
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) { val = x; }


	public ListNode(List<Integer> values){
		ListNode currentNode=null, previousNode=null;
		for(int i=0;i<values.size();i++){
			//init internal value
			if(previousNode==null){
				currentNode=this;
				currentNode.val=values.get(i);
			}else{
				currentNode = new ListNode(values.get(i));
				previousNode.next = currentNode;
			}
			//move on
			previousNode = currentNode;
		}
	}

	/**
	 * Adds current list to given list returning a brand new ListNode
	 * @param l2
	 * @returns
	 */
	public ListNode sum(ListNode l2){
		//Turn lists into Integers
		Integer l1Sum = this.toInteger();
		Integer l2Sum = l2.toInteger();

		//Sum numbers
		Integer sum = l1Sum+l2Sum;

		//Turn result into ListNode
		return ListNode.fromInteger(sum);
	}

	/**
	 * Turns a LisNode into an Integer
	 * @return
	 */
	public Integer toInteger(){
		Integer sum=0;
		Integer units=1;
		ListNode current = this;
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
	public static ListNode fromInteger(Integer num){
		Integer left = num;
		ListNode previousNode=null;
		ListNode currentNode;
		ListNode root = null;

		while(left>0){
			Integer mod = left%10;
			left = left/10;
			currentNode = new ListNode(mod);

			if(previousNode==null){
				root = currentNode;
			}else{
				previousNode.next=currentNode;
			}
			previousNode=currentNode;
		}
		return root;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.val);
		if(this.next!=null){
			stringBuilder.append(" -> ");
			stringBuilder.append(this.next.toString());
		}
		return stringBuilder.toString();
	}
}
