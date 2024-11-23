package Practice;


class Node1 {
	int val;
	Node1 next;

	Node1(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CircularLinkedList {

	static Node1 head;
	// 0 1 2 3 4

	public static void insertAtBegin(int val) {
		Node1 newNode1 = new Node1(val);

		if (head == null) {
			head = newNode1;
			head.next = head;
			return;
		}
		// 0 1 2 3
		newNode1.next = head;
		Node1 current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = newNode1;
		current.next = head;
	}

	public static void insertAtEnd(int val) {
		Node1 newNode1 = new Node1(val);
		if(head == null) {
			head = newNode1;
			head.next = head;
		}
		
		Node1 current = head;
		while(current.next != head) {
			current = current.next;
		}
		current.next = newNode1;
		newNode1.next = head;
	}

	public static void insertAtAnyPosition(int val, int position) {
		Node1 newNode1 = new Node1(val);
	
		if(head == null) {
			head = newNode1;
			head.next = head;
			return;
		}
		
		if(position == 0) {
			insertAtBegin(val);
			return;
		}
		
		int currentPosition = 0;
		Node1 current = head;
		while(current.next != head && currentPosition < position-1) {
			currentPosition++;
			current = current.next;
		}
		
		if(current.next == null) {
			newNode1.next = null;
			current.next = newNode1;
		}
		else {
			newNode1.next = current.next;
			current.next = newNode1;
		}
		
		// 0 1 2 3 4 5
	}
	
	public static void deleteNode(int val) {
		if(head == null) {
			System.out.println("List is empty ");
			return;
		}
		
		Node1 current = head;
		Node1 prev = head;
		
		if(head.val == val) {
			while(current.next != head) {
				current = current.next;
			}
			head = head.next;
			current.next = head;
			return;
		}
		
		while(current.next != head && current.val != val) {
			prev = current;
			current = current.next;
		}
		if(current.val == val) {
			if(current.next == null) {
				prev.next = null;
			}
			else {
				prev.next = current.next;
			}
		}
		else {
			System.out.println("Node not found ");
		}
		
		// 1 2 3 4 5 
	}

	public static void traverse() {

		if (head == null) {
			return;
		}

		Node1 current = head;
		System.out.print("List Nodes are :  ");
		System.out.print(current.val + " ");
		while (current.next != head) {
			current = current.next;
			System.out.print(current.val + " ");
		}
		System.out.println();

		// 1 2 3
	}

	public static int findLength() {
		int length = 0;
		if(head == null) {
			return length;
		}
		
		Node1 current = head;
		while(current.next != head) {
			length++;
			current = current.next;
		}
		return length+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertAtBegin(30);
		insertAtBegin(20);
		insertAtBegin(10);
		traverse();
		System.out.println("length : " + findLength());
		
		insertAtEnd(40);
		insertAtEnd(50);
		traverse();
		System.out.println("length : " + findLength());
		
		insertAtAnyPosition(400, 1);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.println("delete 200 : ");
		deleteNode(200);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.println("delete 400 : ");
		deleteNode(400);
		traverse();
		System.out.println("length : " + findLength());
	
	}

}
