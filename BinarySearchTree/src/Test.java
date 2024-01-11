
public class Test {
	public static void main(String[] args) {
		BST obj1=new BST();
		

		obj1.insert(60);
		obj1.insert(35);
		obj1.insert(75);
		obj1.insert(40);
		obj1.insert(20);
		obj1.insert(70);
		obj1.insert(85);
		obj1.inorder();
		System.out.println();
		System.out.println("--------------------------------");
		obj1.preorder();
		System.out.println();
		System.out.println("--------------------------------");
		obj1.postorder();
	}
}
