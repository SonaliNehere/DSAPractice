package Practice;

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedList {

	static Node head;

	public static void insertNodeAtStart(int val) {

		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public static void insertNodeAtEnd(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while (current.next != null) {
//				System.out.println(current.val + " ");
			current = current.next;
		}
		current.next = newNode;

	}

	public static void insertAtAnyPosition(int val, int position) {

		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			return;
		}
		
		if(position == 0) {
			insertNodeAtStart(val);
			return;
		}

		int currentPosition = 0;
		Node current = head;
		while (currentPosition < position - 1 && current.next != null) {
			currentPosition++;
			current = current.next;
		}
		
		if(current.next == null) {
			newNode.next = null;
			current.next = newNode;
		}else {
			newNode.next = current.next;
			current.next = newNode;
		}
		

		//0 1 2 3 4 5 6 7
	}

	public static void deleteNode(int val) {
		if(head == null) {
			System.out.println("List is empty ");
			return;
		}
		
		if(head.val == val) {
			head = head.next;
			return;
		}
		
		Node current = head;
		Node previous = head;
		while(current.val != val && current.next !=null) {
			previous = current;
			current = current.next;
		}
		
		if(current.val == val) {
			previous.next = current.next;
		}
		else {
			System.out.println("Node not found");
		}
		
		
		// 1 2 3 4 5 6
	}
	
	public static void traverseList() {
		Node current = head;
		System.out.print("List nodes are :  ");
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static int findLength() {
		int length = 0;
		Node current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		
//		insertAtAnyPosition(0, 10);
//		traverseList();
//		System.out.println("length : " + findLength());
//
//		insertNodeAtEnd(80);
//
//		insertNodeAtStart(40);
//		insertNodeAtStart(30);
//		insertNodeAtStart(20);
//		insertNodeAtStart(10);
//		traverseList();
//		System.out.println("length : " + findLength());

		insertNodeAtEnd(50);
		insertNodeAtEnd(60);
		insertNodeAtEnd(70);
		traverseList();
		System.out.println("length : " + findLength());
		
		insertAtAnyPosition(0, 1);
		traverseList();

//		insertAtAnyPosition(90, 4);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		insertAtAnyPosition(900, 0);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		insertAtAnyPosition(9000, 10);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		System.out.println("delete node 10 ");
//		deleteNode(10);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		System.out.println("delete node 900 ");
//		deleteNode(900);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		System.out.println("delete node 70 ");
//		deleteNode(70);
//		traverseList();
//		System.out.println("length : " + findLength());
//
//		System.out.println("delete node 60 ");
//		deleteNode(60);
//		traverseList();
//		System.out.println("length : " + findLength());
//
//		System.out.println("delete node 30 ");
//		deleteNode(30);
//		traverseList();
//		System.out.println("length : " + findLength());
//		
//		System.out.println("delete node 60 ");
//		deleteNode(60);
//		traverseList();
//		System.out.println("length : " + findLength());



	}

}
