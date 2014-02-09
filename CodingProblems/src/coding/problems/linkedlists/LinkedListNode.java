package coding.problems.linkedlists;

/**
 * A node in a Linked List.
 * 
 * @author Carlos G. Gavidia (cgavidia@acm.org)
 * 
 * @param <E>
 *            Data type of the node's data.
 */
public class LinkedListNode<E> {

	private LinkedListNode<E> nextNode;
	private E data;

	public LinkedListNode(E data) {
		this.data = data;
	}

	public LinkedListNode<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode<E> nextNode) {
		this.nextNode = nextNode;
	}

	public E getData() {
		return data;
	}
}
