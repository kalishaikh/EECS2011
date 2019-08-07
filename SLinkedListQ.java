/*
 * A class that implements the QueueADT as a Singly-Linked List
 */
public class SLinkedListQ<E> implements QueueADT<E> {

	// Nested Node Class
	private static class Node<E> {

		private Node<E> next; // Next node
		private E element; // Element held by the node

		public Node() {

		}

		/*
		 * Constructor which creates a node with given destination and element.
		 * 
		 * @param e the element
		 * 
		 * @param n the node
		 */

		public Node(E e, Node<E> n) {
			next = n;
			element = e;
		}

		/*
		 * Sets the next node to the node passed
		 * 
		 * @param n the next node
		 */

		public void setNext(Node<E> n) {
			next = n;
		}

		/*
		 * Sets the element of a node
		 * 
		 * @param e the element
		 */

		public void setElement(E e) {
			element = e;
		}

		/*
		 * Gets the element attached to a node
		 * 
		 * @return the element on a node
		 */

		public E getElement() {
			return element;
		}

		/*
		 * Gets the next node in the linked list
		 * 
		 * @return the node
		 */

		public Node<E> getNext() {
			return next;
		}

	}

	// End of nested node class

	// Instance Variables
	private Node<E> head; // beginning of the node
	private Node<E> tail; // end of the node
	private int size; // size of the linked list

	public SLinkedListQ() {

		tail = new Node<E>(null, null); // Initially have the tail with no element pointing to null
		head = new Node<E>(null, null); // Initially have the head with no element pointing to null
		size = 0; // Creates a list with no size
	}

	/*
	 * Checks the size of the linked list
	 * 
	 * @return the size of the list
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/*
	 * Returns true if the size of the list is 0, false otherwise.
	 * 
	 * @return boolean of list size
	 */

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	/*
	 * Checks the first element in the list and returns it without removing that
	 * element. If no elements exist return null.
	 */

	public E first() {
		if (size == 0) {
			return null;
		} else {
			return head.getElement();
		}
	}

	/*
	 * Removes the first element in the list and returns it. If there is no element,
	 * returns null.
	 */

	public E dequeue() {
		if (size == 0) {
			return null;
		} else {
			Node<E> temp = head;
			head = head.next;
			size--;
			return temp.getElement();
		}

	}

	/*
	 * Adds the element to the end of the list.
	 * 
	 * @param e The element being added
	 */
	public void enqueue(E e) {
		if (size == 0) {
			head = tail;
			head.setElement(e);
			size++;
		} else {
			Node<E> temp = new Node<E>(e, null);
			tail.setNext(temp);
			tail = temp;
			size++;
		}

	}

}

