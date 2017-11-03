package queueAndDeque;

import queueAndDeque.ArrayQueue;

public class PCQ4A {

	public static void main(String[] args) {
		ArrayQueue<String> s = new ArrayQueue<String>();
		System.out.println(s);
		s.enqueue("Ireland");
		System.out.println(s);
		s.dequeue();
		System.out.println(s);
		s.enqueue("England");
		System.out.println(s);
		s.dequeue();
		System.out.println(s);
		s.enqueue("Wales");
		System.out.println(s);
	}

}