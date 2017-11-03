/**
 * 
 */
package queueAndDeque;

/**
 * @author 12312821
 * General element location abstraction
 */
public class Position<N> {
	

	/**
	 * The element to which the position points
	 */
	private N element;
	
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
	public Position(N element) {
		this.element = element;
	}
		
	
	/**
	 * @return the element to which the position points
	 */
	public N getElement() {
		return element;
	}
	
	
	/**
	 * set the pointer to another element
	 */
	public void setElement(N element) {
		this.element = element;
	}
}	


////
///**
// * 
// */
//package queueAndDeque;
//
///**
// * @author 12312821
// * General element location abstraction
// */
//public class Position<E> {
//	
//
//	/**
//	 * The element to which the position points
//	 */
//	private DLNode<E> node = new DLNode<E>();
//	
//	/**
//	 * create a pointer object which points to nothing
//	 */
//	public Position() {
//		this(null);
//	}
//	
//	/**
//	 * Constructs a position pointing to the element.
//	 * @param element
//	 */
//	public Position(DLNode<E> node) {
//		this.node = node;
//	}
//		
//	
//	/**
//	 * @return the node to which the position points NOT the element within that node.
//	 */
//	public DLNode<E> getElement() {
//		return node;
//	}
//	
//	
//	/**
//	 * set the pointer to another node
//	 */
//	public void setElement(DLNode<E> node) {
//		this.element = node;
//	}
//}