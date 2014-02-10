package coding.problems.linkedlists;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	private LinkedList<Integer> linkedListForTest;

	@Before
	public void setUp() throws Exception {
		linkedListForTest = new LinkedList<Integer>();

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

		linkedListForTest.setHead(firstNode);

	}

	@Test
	public void testCountElements() {
		assertEquals(1, linkedListForTest.getElementCount(1));
		assertEquals(2, linkedListForTest.getElementCount(2));
		assertEquals(1, linkedListForTest.getElementCount(3));
		assertEquals(3, linkedListForTest.getElementCount(4));
	}

}
