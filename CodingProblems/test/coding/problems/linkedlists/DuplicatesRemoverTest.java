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

		firstNode.setNextNode(secondNode);
		secondNode.setNextNode(thirdNode);
		thirdNode.setNextNode(fourthNode);

		listWithDuplicates.setHead(firstNode);

	}

	@Test
	public void testCountElements() {
		assertEquals(1,
				duplicatesRemover.getElementCount(1, listWithDuplicates));
		assertEquals(2,
				duplicatesRemover.getElementCount(2, listWithDuplicates));
		assertEquals(1,
				duplicatesRemover.getElementCount(3, listWithDuplicates));
	}

	@Test
	public void testRemoveDuplicates() {
		duplicatesRemover.removeDuplicates(listWithDuplicates);
		assertEquals(1,
				duplicatesRemover.getElementCount(1, listWithDuplicates));
		assertEquals(1,
				duplicatesRemover.getElementCount(2, listWithDuplicates));
		assertEquals(1,
				duplicatesRemover.getElementCount(3, listWithDuplicates));

	}

}
