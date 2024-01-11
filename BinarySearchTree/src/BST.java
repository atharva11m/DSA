
public class BST {
	private Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			this.data=d;
			Node right=null;
			Node left=null;
		}
	}
	public BST() {
		root=null;	
	}
	public void insert(int key) {
		root=insertRec(root,key);
	}
	private Node insertRec(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left=insertRec(root.left,key);
		}
		else {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	public void inorder() {
			inorderTraversal(root);
	}
	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			inorderTraversal(root.right);
		}
		
	}
	
	
		public void preorder() {
			preorderTraversal(root);
		}
		
		private void preorderTraversal(Node root) {
			if(root!=null) {
				System.out.print(root.data+",");
				preorderTraversal(root.left);
				preorderTraversal(root.right);
			}
			
		}
		
		public void postorder() {
			postorderTraversal(root);
		}
				
		private void postorderTraversal(Node root) {
			if(root!=null) {
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+",");
			}
					
		}
	}
	
