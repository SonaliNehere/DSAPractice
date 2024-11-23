package Practice;

class TwoWayNode1 {
	int val;
	TwoWayNode1 next;
	TwoWayNode1 prev;

	public TwoWayNode1(int val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}

public class DoubleEndedCircularLinkedList {
	static TwoWayNode1 head;

	public static void insertAtHead(int val) {
		TwoWayNode1 newNode = new TwoWayNode1(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
			return;
		}

		head.prev.next = newNode;
		newNode.prev = head.prev;
		head.prev = newNode;
		newNode.next = head;
		head = newNode;

		// 0 1 2 3
	}

	public static void insertAtTail(int val) {
		TwoWayNode1 newNode = new TwoWayNode1(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
			return;
		}

		head.prev.next = newNode;
		newNode.prev = head.prev;
		newNode.next = head;
		head.prev = newNode;

	}

	public static void insertAtPosition(int val, int position) {

		if (position < 0) {
			System.out.println("Invalid position.");
			return;
		}

		TwoWayNode1 newNode = new TwoWayNode1(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			head.prev = head;
			return;
		}

		if (position == 0) {
			insertAtHead(val);
			return;
		}

		int currentPosition = 0;
		TwoWayNode1 current = head;
		while (current.next != head && currentPosition < position - 1) {
			current = current.next;
			currentPosition++;
		}
		newNode.next = current.next;
		newNode.prev = current;
		current.next.prev = newNode;
		current.next = newNode;

		// 0 1 2 3 4 5
		// 6
	}

	public static void deleteNode(int val) {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		}

		if (head.val == val) {
			if (head.next == head) {
			    head = null;
			}
			else {
				head.next.prev = head.prev;
				head.prev.next = head.next;
				head = head.next;
			}
			return;
		}
		
		TwoWayNode1 current = head;
		while (current.next != head && current.val != val) {
			current = current.next;
		}

		if (current.val == val) {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		} else {
			System.out.println("node not found");
		}

	}

	public static void traverse() {

		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		TwoWayNode1 current = head;
		System.out.print("List nodes are :  ");
		System.out.print(current.val + " ");
		while (current.next != head) {
			current = current.next;
			System.out.print(current.val + " ");
		}
		System.out.println();
	}

	// 1 2 3 4
	public static int findLength() {
		int length = 0;
		if (head == null)
			return length;

		TwoWayNode1 current = head;
		while (current.next != head) {
			length++;
			current = current.next;
		}

		return length + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		traverse();
//		System.out.println("length : " + findLength());

		insertAtHead(30);
		traverse();
		System.out.println("length : " + findLength());

//		insertAtHead(20);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtHead(10);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtTail(40);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtTail(50);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtPosition(999, 1);
//		traverse();
//		System.out.println("length : " + findLength());

		System.out.println("delete 30 : ");
		deleteNode(30);
		traverse();
		System.out.println("length : " + findLength());
//		
//		System.out.println("delete 50 : ");
//		deleteNode(50);
//		traverse();
//		System.out.println("length : " + findLength());

	}

}
