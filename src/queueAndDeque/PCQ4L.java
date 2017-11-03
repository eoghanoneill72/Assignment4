package queueAndDeque;

import queueAndDeque.LinkedDeque;

public class PCQ4L {

	public static void main(String[] args) {
		LinkedDeque<String> s = new LinkedDeque<String>();
		System.out.println(s);
		s.addFirst("Ireland");
		System.out.println(s);
		s.removeLast();
		System.out.println(s);
		s.addLast("England");
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);
		s.addLast("Wales");
		System.out.println(s);
		s.addFirst("Scotland");
		System.out.println(s);
		s.addLast("France");
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);
		s.removeLast();
		System.out.println(s);
		s.addLast("Germany");
		System.out.println(s);
	}

}
