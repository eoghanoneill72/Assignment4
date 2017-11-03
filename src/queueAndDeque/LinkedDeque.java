/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 *
 */
public class LinkedDeque<E> implements Deque<E> {


	protected DLNode<E> front, rear;  // sentinels
	protected int size;    // current number of elements held.
	
	/**
	 * Creates empty deque of type E objects.
	 */
	public LinkedDeque() {
	front = new DLNode<E>();
    rear = new DLNode<E>();
    size = 0;
	}
	

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#size()
	 */
	@Override
	public int size() {
		return size;
	}
	

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#getFirst()
	 */
	@Override
	public E getFirst() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque Empty! Cannot get First!");
		return front.getElement();
	}
	

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#getLast()
	 */
	@Override
	public E getLast() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque is empty, cannot get last!");
		//Chain methods, get element within node
		return rear.getElement();
	}

	
	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E element) {
		DLNode<E> node = new DLNode<E>(element);
		if (isEmpty()) {
			//both front and rear point to same node
			front = rear = node;			
		}else {
			//the list has a pre-existing front and rear to negotiate
			//the new node now points to what was the front element
			node.setNext(front);
			//the old front now points back to the new node
			front.setPrev(node);
			//the role of front is officially transferred to the new node
			front = node;			
		}
		size++;
		
	}

	
	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(E element) {
		DLNode<E> node = new DLNode<E>(element);
		if (front == null) {
			//then the list is empty and front and rear are null
			node.setPrev(front);
			node.setNext(rear);
			// reassign both front and rear to point to new node
			front = node;
		}else {
			//the list is not empty and has a rear
			rear.setNext(node);
			node.setPrev(rear);
		}
		rear = node;
		size++;
	}
	

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#removeFirst()
	 */
	@Override
	public E removeFirst() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque already empty, cannot remove first!");
		//extract node element to temporary variable
		E e = front.getElement();
		size--;
		if(size==0) {
			front = rear = null;
		}else {
			//assign front to the second element
			front = front.getNext();
			//new front should not be the successor of the old front
			front.setPrev(null);
		}
		return e;
		
	}

	/* (non-Javadoc)
	 * @see queueAndDeque.Deque#removeLast()
	 */
	@Override
	public E removeLast() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque already empty, cannot remove last!");
		E e = rear.getElement();
		size--;
		
		if (size==0) {
		// removal leaves an empty list
			front = rear = null;
		}else {
		// removal leaves non-empty list
		rear = rear.getPrev();
		rear.setNext(null);
		}
		return e;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//start at the front and iterate through nodes
		DLNode<E> temp = front;
		while (temp != null) {
			sb.append(temp.toString());
			temp = temp.getNext();
		}
		return sb.toString();
	}
	

}
