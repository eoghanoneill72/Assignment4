/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 *
 */
public class LinkedDeque<E> implements Deque<E> {

	/**
	 * 
	 */
	public LinkedDeque() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E getFirst() throws EmptyDequeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() throws EmptyDequeException {
		// TODO Auto-generated method stub
		return null;
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
