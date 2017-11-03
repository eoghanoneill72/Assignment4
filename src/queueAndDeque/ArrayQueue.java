/**
 * 
 */
package queueAndDeque;

import queueAndDeque.Queue;

/**
 * @author 12312821
 *
 */
public class ArrayQueue<E> implements Queue<E> {

	/**
	 * 
	 */
	private E[] data;
	private int size = 0;
	private int f = 0;
	static final int defaultCapacity = 100;
	
	public ArrayQueue() {
		this(defaultCapacity);
	}


	public ArrayQueue(int capacity) {
		data = (E[])(new Object[capacity]);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E front() throws EmptyQueueException {
		if (size == 0) {
			throw new EmptyQueueException("Queue is empty!");
		}else {
			return data[f];
		}
	}

	@Override
	public void enqueue(E element) {
		if(size == data.length) {
			int freeIndex = (f + size) % data.length;
			data[freeIndex] = element;
			size++;
		}
		
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		if(isEmpty()) {
			return null;
		}else{
			return data[f];
		}
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("size: "+size());
		
		for (int i = 0 ; i<size ; i++) {
			sb.append(data[i].toString()+"\n");
		}
		return sb.toString();
	}
	
	

}
