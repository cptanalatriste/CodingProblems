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
			int elementCount = getElementCount(currentNode.getData(),
					linkedList);
			if (elementCount > 1) {
				removeFrom(currentNode.getData(), currentNode);
			}
			currentNode = currentNode.getNextNode();
		}
	}

	public int getElementCount(E elementToCount, LinkedList<E> linkedList) {
		int elementCount = 0;
		LinkedListNode<E> currentNode = linkedList.getHead();
		while (currentNode != null) {
			if (currentNode.getData().equals(elementToCount)) {
				elementCount++;
			}
			currentNode = currentNode.getNextNode();
		}
		return elementCount;
	}

	private void removeFrom(E elementToRemove, LinkedListNode<E> nodeToStart) {
		LinkedListNode<E> currentNode = nodeToStart.getNextNode();
		while (currentNode != null) {
			LinkedListNode<E> nextNode = currentNode.getNextNode();
			if (nextNode.getData().equals(elementToRemove)) {
				currentNode.setNextNode(nextNode.getNextNode());
			}
			currentNode = currentNode.getNextNode();
		}
	}
}
