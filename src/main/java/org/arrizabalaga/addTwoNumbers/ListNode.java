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
