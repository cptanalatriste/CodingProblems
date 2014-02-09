package coding.problems.linkedlists;

/**
 * A Linked-List representation.
 * 
 * @author Carlos G. Gavidia (cgavidia@acm.org)
 * 
 * @param <E>
 *            Data type of the node's data.
 */
public class LinkedList<E> {

	private LinkedListNode<E> head;

	public void removeElement(E elementToRemove) {

		if (this.getHead().getData().equals(elementToRemove)) {
			this.setHead(head.getNextNode());
		}

		LinkedListNode<E> currentNode = this.getHead();
		while (currentNode.getNextNode() != null) {
			LinkedListNode<E> nextNode = currentNode.getNextNode();
			if (nextNode.getData().equals(elementToRemove)) {
				currentNode.setNextNode(nextNode.getNextNode());
			}
		}
	}

	public LinkedListNode<E> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<E> head) {
		this.head = head;
	}

}
