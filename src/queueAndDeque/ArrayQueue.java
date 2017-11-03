package queueAndDeque;

import queueAndDeque.Queue;


/**
 * Referenced: Data Structures and Algorithms by Goodrich, Tamassia and Goldwasser
 * @author 12312821
 *
 *@param <E> generic type
 */

public class ArrayQueue<E> implements Queue<E> {

	private E[] data;
	private int size = 0;
	private int f = 0;
	static final int defaultCapacity = 100;
	
	/**
	 * Default ArrryQueue Constructor
	 */
	public ArrayQueue() {
		this(defaultCapacity);
	}


	/**
	 * Construct Array Queue of designated size
	 * @param capacity
	 */
	public ArrayQueue(int capacity) {
		data = (E[])(new Object[capacity]);
	}

	/* (non-Javadoc)
	 * @see queueAndDeque.Queue#size()
	 */
	@Override
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see queueAndDeque.Queue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/* (non-Javadoc)
	 * @see queueAndDeque.Queue#front()
	 */
	@Override
	public E front() throws EmptyQueueException {
		if (isEmpty()) throw new EmptyQueueException("Queue is empty!");
		return data[f];
	}

	/* (non-Javadoc)
	 * @see queueAndDeque.Queue#enqueue(java.lang.Object)
	 */
	@Override
	public void enqueue(E element) throws IllegalStateException{
		if(size == data.length) throw new IllegalStateException("Array is full!");
		//otherwise there is space
		int freeIndex = (f + size) % data.length;
		data[freeIndex] = element;
		size++;
	}


	/* (non-Javadoc)
	 * @see queueAndDeque.Queue#dequeue()
	 */
	@Override
	public E dequeue() throws EmptyQueueException {
		if(isEmpty()) throw new EmptyQueueException("You can't dequeue an empty queue!");
		E answer = data[f];
		data[f] = null;
		f = (f+1) % data.length;
		size--;
		return answer;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Queue = [ ");
		
		// iterate from the first element of the cicular array to the last element
		for (int i = f ; i<f+size ; i++) {
			sb.append(data[i]+" ");
		}
		return (sb.append("]\n")).toString();
	}

}
