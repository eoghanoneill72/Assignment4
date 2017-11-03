/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 *
 */
public class LinkedDeque<E> implements Deque<E> {

	protected Position<E> front, rear;  // sentinels
//	protected DLNode<E> front, rear;  // sentinels
	protected int size;    // current number of elements held.
	
	/**
	 * Creates empty deque.
	 */
	public LinkedDeque() {
	front = new Position<E>();
    rear = new Position<E>();
    //both pointing to null by default
//    front.setElement(rear);  // make header point to trailer
//    rear.setElement(front);  // make trailer point to header
    size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public E getFirst() throws EmptyDequeException {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyDequeException("Deque Empty!");
		return front.getElement();
	}

	@Override
	public E getLast() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque is empty.");
		return rear.getElement();
	}

	@Override
	public void addFirst(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E removeFirst() throws EmptyDequeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() throws EmptyDequeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		//TODO Change This!!
		return "LinkedDeque [size()=" + size() + ", isEmpty()=" + isEmpty() + ", getFirst()=" + getFirst()
				+ ", getLast()=" + getLast() + ", removeFirst()=" + removeFirst() + ", removeLast()=" + removeLast()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
