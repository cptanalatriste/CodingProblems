package coding.problems.linkedlists;

/**
 * Class for remove duplicate elements from an unsorted linked list. Problem
 * taken from Cracking the Coding Interview from Gayle Laakmann.
 * 
 * @author Carlos G. Gavidia (cgavidia@acm.org)
 * 
 * @param <E>
 *            Data type of the Linked List Node's data.
 */
public class DuplicatesRemover<E> {

	public void removeDuplicates(LinkedList<E> linkedList) {
		LinkedListNode<E> currentNode = linkedList.getHead();
		while (currentNode != null) {
			removeFrom(currentNode.getData(), currentNode);
			currentNode = currentNode.getNextNode();
		}
	}

	/**
	 * Removes elements that have a particular data value, excluding the node
	 * that starts the traversal.
	 * 
	 * @param elementToRemove
	 *            Element to remove.
	 * @param nodeToStart
	 *            Node that starts the list traversal.
	 */
	private void removeFrom(E elementToRemove, LinkedListNode<E> nodeToStart) {
		LinkedListNode<E> currentNode = nodeToStart;
		LinkedListNode<E> nextNode = null;
		LinkedListNode<E> previousNode = null;

		while (currentNode != null) {
			nextNode = currentNode.getNextNode();
			if (nextNode != null && elementToRemove.equals(nextNode.getData())) {
				currentNode.setNextNode(nextNode.getNextNode());
			} else if (nextNode == null
					&& elementToRemove.equals(currentNode.getData())) {
				previousNode.setNextNode(null);
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
	}
}
