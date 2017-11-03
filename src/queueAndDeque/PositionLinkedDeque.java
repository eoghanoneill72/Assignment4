p/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 *
 */
public class PositionLinkedDeque<E> implements Deque<E> {

	protected Position<DLNode<E>> front;
	protected Position<DLNode<E>> rear;  // sentinels
//	protected DLNode<E> front, rear;  // sentinels
	protected int size;    // current number of elements held.
	
	/**
	 * Creates empty deque.
	 */
	public PositionLinkedDeque() {
	front = new Position<DLNode<E>>();
    rear = new Position<DLNode<E>>();
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
		return front.getElement().getElement();
	}

	@Override
	public E getLast() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque is empty.");
		//Chain methods, get element within node
		return rear.getElement().getElement();
	}

	@Override
	public void addFirst(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E element) {
		// TODO Auto-generated method stub
		DLNode<E> node = new DLNode<E>();
		if (front == null) {
			front.setElement(node);
		}
	}

	@Override
	public E removeFirst() throws EmptyDequeException {
		// TODO Auto-generated method stub
		if (isEmpty()) return null;
		E e = front.getElement().getElement();
		front.getElement().setNext(front);
		size++;
		
		if (size>0) {
			front.getElement().getPrev() = null;
			
		}
		return e;
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
