
public class MyStack {
	Node top;
	public class Node{
		int data;
		Node next;
		public Node(int n) {
			super();
			this.data=n;
			next=null;
		}
	}
	public MyStack() {
		super();
		top=null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void insert(int n) {
		Node newnode=new Node(n);
		if(isEmpty()) {
			top=newnode;
			//System.out.println("stack is empty");
		}
		else {
			if(top!=null) {
				newnode.next=top;
			}
			
		}
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stacknis Empty");
			return -1;
		}
		else {
			Node temp=top;
			top=top.next;
			temp.next=null;
			return temp.data;
			
		}
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			while(top!=null) {
				System.out.println(top.data);
				top=top.next;
			}
		}
	}

}
