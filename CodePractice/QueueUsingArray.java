package Practice;

public class QueueUsingArray {

	int arr[];
	int front;
	int rear;
	int capacity;

	public QueueUsingArray(int size) {
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.capacity = size;
	}

	public boolean push(int val) {
		if (rear == capacity - 1) {
			System.out.println("Queue is full. can't push");
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		rear++;
		arr[rear] = val;
		System.out.println(val + " inserted.");
		return true;
	}

	public boolean pop() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is empty, Can't pop.");
			return false;
		}
		System.out.println(arr[front] + " deleted.");
		front++;
		
		if (front > rear) {
			front = -1;
			rear = -1;
		}
		
		return true;
	}

	public void traverse() {
		if (rear == -1 || front > rear) {
			System.out.println("Queue is empty, Can't traverse.");
			return;
		}
		System.out.print("Elements are : ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int size() {
		if (rear == -1 || front > rear) {
			System.out.println("Queue is empty.");
			return 0;
		}
		return rear-front + 1;
	}
	
	public int peek() {
		if (rear == -1 || front > rear) {
			System.out.println("Queue is empty. Can't peek");
			return -1;
		}
		return arr[front];
	}

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(5);
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.push(0);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.push(1);
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(2);
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(3);
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		
		queue.push(4);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.push(5);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		
		queue.push(6);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");
		
		queue.pop();
		queue.traverse();
		System.out.println("Length is : " + queue.size()  + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

	}

}
