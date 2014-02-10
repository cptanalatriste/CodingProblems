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

	public LinkedListNode<E> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<E> head) {
		this.head = head;
	}

	/**
	 * Gets the number of nodes that have a particular data value.
	 * 
	 * @param elementToCount
	 *            Data value to count.
	 * @return
	 */
	public int getElementCount(E elementToCount) {
		int elementCount = 0;
		LinkedListNode<E> currentNode = this.getHead();
		while (currentNode != null) {
			if (currentNode.getData().equals(elementToCount)) {
				elementCount++;
			}
			currentNode = currentNode.getNextNode();
		}
		return elementCount;
	}

}
