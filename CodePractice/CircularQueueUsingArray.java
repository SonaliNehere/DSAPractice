package Practice;

public class CircularQueueUsingArray {

	int arr[];
	int front;
	int rear;
	int capacity;
	int size;

	public CircularQueueUsingArray(int size) {
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.capacity = size;
		this.size = 0;
	}

	public boolean enque(int val) {
		if (size >= capacity) {
			System.out.println("Queue is full. can't push");
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		rear = (rear + 1) % capacity;
		arr[rear] = val;
		System.out.println(val + " inserted.");
		size++;
		return true;
	}

	public boolean deque() {
		if (size == 0) {
			System.out.println("Queue is empty, Can't pop.");
			return false;
		}

		System.out.println(arr[front] + " deleted.");
		if (size == 1) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % capacity;
		}
		size--;

		return true;
	}

	public void traverse() {
		if (size == 0) {
			System.out.println("Queue is empty, Can't traverse.");
			return;
		}

		System.out.print("Elements are : ");
		for (int i = (front) % capacity; i != rear; i = (i + 1) % capacity) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[rear] + " ");
		System.out.println();
	}

	public int size() {
		return size;

//		 if (front == -1) {
//		        return 0; // Queue is empty
//		    }
//		    return (capacity + rear - front + 1) % capacity;
		// this is also correct
	}

	public int peek() {
		if (size == 0) {
			System.out.println("Queue is empty. Can't peek");
			return -1;
		}
		return arr[front];
	}

	public static void main(String[] args) {
		CircularQueueUsingArray queue = new CircularQueueUsingArray(5);

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 0");
		queue.enque(0);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 1");
		queue.enque(1);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 2");
		queue.enque(2);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 3");
		queue.enque(3);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");

		System.out.println("insert 4");
		queue.enque(4);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 5");
		queue.enque(5);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");

		System.out.println("insert 6");
		queue.enque(6);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		System.out.println("insert 66");
		queue.enque(66);
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

		queue.deque();
		queue.traverse();
		System.out.println("Length is : " + queue.size() + "\n");
		System.out.println("Peek element : " + queue.peek() + "\n");

	}

}
