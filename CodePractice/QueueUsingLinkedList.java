package Practice;

class QueueNode{
	int val;
	QueueNode next;
	
	public QueueNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class QueueUsingLinkedList {
	
	QueueNode head;
	QueueNode tail;
	
	public void push(int val) {
		QueueNode newNode = new QueueNode(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		System.out.println(tail.val + " inserted. ");
		// 1 2 3 4
	}
	
	public void pop() {
		if(head == null || tail == null) {
			System.out.println("Queue is empty. Can't pop.");
			return;
		}
		
		System.out.println(head.val + " deleted. ");
		head = head.next;
	}
	
	public void traverse() {
		if(head == null || tail == null) {
			System.out.println("Queue is empty. Can't traverse.");
			return;
		}
		
		QueueNode current = head;
		System.out.print("Elements are : ");
		while(current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public int size() {
		int length = 0;
		
		QueueNode current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
		//1 2 3
	}

	public int peek() {
	    if (head == null) {
	        System.out.println("Queue is empty. Can't peek.");
	        return -1; // or any other indicator for empty queue
	    }
	    return head.val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(0);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(1);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(2);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(3);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(4);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
	}

}
