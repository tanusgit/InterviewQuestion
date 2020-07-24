package dataStructures;

public class Main {

	public static void main(String args[]) {
		linked m = new linked();
		Node head = new Node();
		m.addFront(5, head);
		m.printNode(head);
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
	}

	Node() {

	}

	public String toString() {
		String res = "printing head" + " " + data;
		return res;
	}
}

class linked {

	public Node addFront(int d, Node head) {
		Node temp = new Node(d);
		temp = head;
		if (head == null) {
			head = temp;
		} else {
			head.next = temp;
		}
		return head;
	}

	public void printNode(Node head) {
		Node temp = head;
		while (temp != null) {
			temp = temp.next;

		}
		System.out.println(temp.data);
	}

}