package Practice;

class StackNode {
	int val;
	StackNode next;

	public StackNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class StackUsingLinkedList {

	StackNode head;

	public void push(int val) {
		StackNode newNode = new StackNode(val);

		newNode.next = head;
		head = newNode;
	}

	public void pop() {
		if (head == null) {
			System.out.println("Stack is empty. No elements to pop.");
			return;
		}

		System.out.println(head.val + " deleted ");
		head = head.next;
		// 1 2 3 4

	}

	public void traverse() {
		if (head == null) {
			System.out.println("Stack is empty ");
			return;
		}

		StackNode current = head;
		System.out.print("Stack elements are : ");
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int size() {
		int length = 0;
		StackNode current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	public int peek() {
		if (head == null) {
			System.out.println("Stack is empty. No peek element.");
			return -1;
		}
		
		return head.val;
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();

		System.out.println("Push 0");
		stack.push(0);
		stack.traverse();
		System.out.println("Length : " + stack.size());
		System.out.println("Peek element is : " + stack.peek());

		System.out.println("Push 1");
		stack.push(1);
		stack.traverse();
		System.out.println("Length : " + stack.size());
		System.out.println("Peek element is : " + stack.peek());

		System.out.println("Push 2");
		stack.push(2);
		stack.traverse();
		System.out.println("Length : " + stack.size());
		
		System.out.println("Peek element is : " + stack.peek());

		stack.pop();
		stack.traverse();
		System.out.println("Length : " + stack.size());
		System.out.println("Peek element is : " + stack.peek());

	}

}
