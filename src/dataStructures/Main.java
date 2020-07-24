package dataStructures;

public class Main {

	public static void main(String args[]) {
		linked m = new linked();
		m = m.addFront(m, 5);
		m = m.addFront(m, 6);
		m = m.addFront(m, 8);
		m.printNode(m);
		
		

	}

}

class linked {

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}

		Node() {

		}

	}

	Node head;
	int size = 0;
	linked list;

	linked(int num, int val){
	for(int i = 0; i <num; i++) {
		Node node = new Node(val);
		
	}
	
	}

	linked() {
		size++;
	}

	public int size() {
		return size;
	}

	public  linked addFront(linked list, int d) {
		Node temp;
		Node head = new Node(d);
		temp = head;
		if (list.head == null) {
			list.head = temp;
		} else {
			list.head.next = temp;
		}
		return list;
	}

	public void printNode(linked list) {
		while (list.head != null) {
			System.out.println(list.head.data);
			list.head = list.head.next;
		}
		
	}

}