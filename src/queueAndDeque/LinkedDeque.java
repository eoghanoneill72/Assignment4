/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 *
 */
public class LinkedDeque<E> implements Deque<E> {

//	protected Position<DLNode<E>> front;
//	protected Position<DLNode<E>> rear;  // sentinels
	protected DLNode<E> front, rear;  // sentinels
	protected int size;    // current number of elements held.
	
	/**
	 * Creates empty deque.
	 */
	public LinkedDeque() {
	front = new DLNode<E>();
    rear = new DLNode<E>();
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
		//Chain methods, get element within node
		return rear.getElement();
	}

	@Override
	public void addFirst(E element) {
		DLNode<E> node = new DLNode<E>();
		front.setPrev(node);
		front = node;
	}

	@Override
	public void addLast(E element) {
		DLNode<E> node = new DLNode<E>();
		node.setNext(null);
		if (front == null) {
			node.setPrev(null);
			front = node;
		}else {
			rear.setNext(node);
		}
		rear = node;
		size++;
	}

	@Override
	public E removeFirst() throws EmptyDequeException {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyDequeException("Deque Empty!");
		E e = front.getElement();
		front = front.getNext();
		size--;
		
		if (size>0) {
			front.setPrev(null);
			return e;
		}else{
			return e;
		}
	}

	@Override
	public E removeLast() throws EmptyDequeException {
		if (isEmpty())
			throw new EmptyDequeException("Deque Empty!");
		E e = rear.getElement();
		rear = rear.getPrev();
		size--;
		
		if(size>0) {
			rear.setNext(null);
			return e;
		}else {
			return e;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DLNode<E> temp = front;
		while (temp.getNext() != null) {
			sb.append(temp.toString());
			temp = temp.getNext();
		}
		return sb.toString();
	}
	
	
	

}
