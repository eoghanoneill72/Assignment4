package queueAndDeque;

import queueAndDeque.LinkedDeque;

public class PCQ4L {

	public static void main(String[] args) {
		LinkedDeque<String> s = new LinkedDeque<String>();
		System.out.println("Initially\nList = [ "+ s + "]\n");
		s.addFirst("Ireland");
		System.out.println("s.addFirst(\"Ireland\")\nList = [ " + s + "]\n");
		s.removeLast();
		System.out.println("s.removeLast()\nList = [ " + s + "]\n");
		s.addLast("England");
		System.out.println("s.addLast(\"England\")\nList = [ " + s + "]\n");
		s.removeFirst();
		System.out.println("s.removeFirst()\nList = [ " + s + "]\n");
		s.addLast("Wales");
		System.out.println("s.addLast(\"Wales\")\nList = [ " + s + "]\n");
		s.addFirst("Scotland");
		System.out.println("s.addFirst(\"Scotland\")\nList = [ " + s + "]\n");
		s.addLast("France");
		System.out.println("addLast(\"France\")\nList = [ " + s + "]\n");
		s.removeFirst();
		System.out.println("s.removeFirst()\nList = [ " + s + "]\n");
		s.removeLast();
		System.out.println("s.removeLast()\nList = [ " + s + "]\n");
		s.addLast("Germany");
		System.out.println("s.addLast(\"Germany\")\nList = [ " + s + "]\n");
	}

}
