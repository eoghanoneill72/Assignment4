/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 * General element location abstraction
 */
public class Position<E> {
	

	/**
	 * The element to which the position points
	 */
	private E element;
	
	/**
	 * create a pointer object which points to nothing
	 */
	public Position() {
		this(null);
	}
	
	/**
	 * Constructs a position pointing to the element.
	 * @param element
	 */
	public Position(E element) {
		this.element = element;
	}
		
	
	/**
	 * @return the element to which the position points
	 */
	public E getElement() {
		return element;
	}
	
	
	/**
	 * set the pointer to another element
	 */
	public void setElement(E element) {
		this.element = element;
	}
}	
