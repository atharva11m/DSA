
public class MyStack {
	public int[] arr;
	public int size;
	private int top;
	public MyStack() {
		this.size=10;
		arr=new int[10];
		top=-1;
	}
	public MyStack(int n) {
		this.size=n;
		arr=new int [n];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public void push(int n) {
		if(isFull()) {
			System.out.println("Stack is Overfull");
		}
		else {
			top++;
			arr[top]=n;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int temp=arr[top];
			top--;
			System.out.println(temp);
			return temp;
		}
	}
	public void printStack() {
		System.out.println(arr);
	}
	

}
