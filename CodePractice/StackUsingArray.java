package Practice;

public class StackUsingArray {
    
    private int[] arr;
    private int top;
    private final int capacity;

    public StackUsingArray(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.capacity = size;
    }

    public boolean push(int val) {
        if (top >= capacity - 1) {
            System.out.println("Stack is full");
            return false;
        }

        arr[++top] = val;
        return true;
    }

    public boolean pop() {
        if (top == -1) {
            System.out.println("Stack is empty. No elements to pop.");
            return false;
        }

        int element = arr[top--];
        System.out.println(element + " deleted");
        return true;
    }

    public void traverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Elements : ");
        for (int i = top; i >= 0; i--) {
            System.out.print("top : " + i + " -> " + arr[i] + ", ");
        }
        System.out.println();
    }

    public int size() {
        return top + 1;
    }
    
    public int peek() {
    	if(top == -1) {
    		System.out.println("Stack is empty. No peek element.");
    		return -1;
    	}
    	return arr[top];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.pop();           // Stack is empty
        stack.traverse();       // Stack is empty
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 0");
        stack.push(0);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 1");
        stack.push(1);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 2");
        stack.push(2);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 3");
        stack.push(3);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 4");
        stack.push(4);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 5"); // Stack should be full
        stack.push(5);
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Pop");
        stack.pop();
        stack.traverse();
        System.out.println("Size: " + stack.size());
        System.out.println("Peek element is : " + stack.peek());

        System.out.println("Push 6");
        stack.push(6);
        stack.traverse();
        System.out.println("Size: " + stack.size());
    }
}
