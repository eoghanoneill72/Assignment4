package queueAndDeque;

import queueAndDeque.ArrayQueue;

/**
 * @author 12312821
 *
 *Executing class to text functionality of ArrayQueue
 */
public class  ArrayQueueTester{

	public static void main(String[] args) {
		ArrayQueue<String> s = new ArrayQueue<String>();
		System.out.println("front<---->rear\n");
		System.out.println("Initially\n"+s);
		s.enqueue("Ireland");
		System.out.println("s.enqueue(\"Ireland\")\n"+s);
		s.enqueue("England");
		System.out.println("s.enqueue(\"England\")\n"+s);
		s.dequeue();
		System.out.println("s.dequeue()\n"+s);
		s.enqueue("Wales");
		System.out.println("s.enqueue(\"Wales\")\n"+s);
	}

}