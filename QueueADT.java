/*
 *	An interface for the queue abstract data type 
 */
public interface QueueADT <E> {
	
	
	int size();
	
	boolean isEmpty();
	
	E first ();
	
	E dequeue();
	

	void enqueue(E e);
	

}
