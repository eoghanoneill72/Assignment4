package queueAndDeque;
/**
 * A simple node class for a doubly-linked list.  Each node has a
 * reference to a stored element, a previous node, and a next node.
 * This class differs from the <code>DNode</code> class in that it
 * does not implement the <code>Position</code> interface, for
 * simplification purposes.
 *
 * @author Roberto Tamassia
 * @see DNode
 * @see Position
 */

//begin#fragment DLNode
public class DLNode<E> {
	private E element;
	private DLNode<E> next, prev;

	/**
	 * default constructor
	 */
	DLNode() {
		this(null, null, null);
	}


	/**
	 * construct floating node
	 * @param e
	 */
	DLNode(E e) {
		this(e,null,null);
	}

	DLNode(E e, DLNode<E> p, DLNode<E> n) {
		element = e;
		next = n;
		prev = p;
	}



	public void setElement(E newElem) { element = newElem; }
	public void setNext(DLNode<E> newNext) { next = newNext; }
	public void setPrev(DLNode<E> newPrev) { prev = newPrev; }
	public E getElement() { return element; }
	public DLNode<E> getNext() { return next; }
	public DLNode<E> getPrev() { return prev; }


	@Override
	public String toString() {
		if (element != null) {
			return element.toString()+" ";
		}else {
			return "";
		}
	}


}
