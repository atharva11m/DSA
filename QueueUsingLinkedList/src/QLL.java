
public class QLL {
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		public Node(int n) {
			this.data=n;
			next=null;
		}
	
		
	}
	public QLL() {
		front=null;
		rear=null;
	}
	public boolean isEmpty() {
		return front==null &&rear==null;
	}
	public void insert(int n) {
		Node newnode=new Node(n);
		if(isEmpty()) {
			front=newnode;
			System.out.println("Queue is Empty");
		}
		else {
			rear.next=newnode;
		}
		rear=newnode;
		
		
	}
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			Node temp=front;
			front=front.next;
			temp.next=null;
			return temp.data;
		}
	}
	public void displayAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			
		}
		else {
			Node temp=front;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

}
