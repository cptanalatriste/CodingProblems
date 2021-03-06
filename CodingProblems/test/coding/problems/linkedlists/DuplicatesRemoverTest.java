package coding.problems.linkedlists;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuplicatesRemoverTest {

	private LinkedList<Integer> listWithDuplicates;
	private DuplicatesRemover<Integer> duplicatesRemover;

	@Before
	public void setUp() throws Exception {
		listWithDuplicates = new LinkedList<Integer>();
		duplicatesRemover = new DuplicatesRemover<Integer>();

		LinkedListNode<Integer> firstNode = new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> secondNode = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> fourthNode = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> fifthNode = new LinkedListNode<Integer>(4);
		LinkedListNode<Integer> sixthNode = new LinkedListNode<Integer>(4);
		LinkedListNode<Integer> seventhNode = new LinkedListNode<Integer>(4);

		firstNode.setNextNode(secondNode);
		secondNode.setNextNode(thirdNode);
		thirdNode.setNextNode(fourthNode);
		fourthNode.setNextNode(fifthNode);
		fifthNode.setNextNode(sixthNode);
		sixthNode.setNextNode(seventhNode);

		listWithDuplicates.setHead(firstNode);

	}

	@Test
	public void testRemoveDuplicates() {
		duplicatesRemover.removeDuplicates(listWithDuplicates);
		assertEquals(1, listWithDuplicates.getElementCount(1));
		assertEquals(1, listWithDuplicates.getElementCount(2));
		assertEquals(1, listWithDuplicates.getElementCount(3));
		assertEquals(1, listWithDuplicates.getElementCount(4));
	}
}
