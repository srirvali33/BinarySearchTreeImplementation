package Binarytreetest;

public class tester {

	public static void main(String[] args) {

		binsertree trevar = new binsertree();
		trevar.insert(100);
		trevar.insert(50);
		trevar.insert(200);
		trevar.insert(150);
		trevar.insert(300);
		trevar.insert(25);
		trevar.insert(75);
		trevar.insert(12);
		trevar.insert(37);
		trevar.insert(125);
		trevar.insert(175);
		trevar.insert(250);
		trevar.insert(320);
		trevar.insert(67);
		trevar.insert(87);
		trevar.insert(94);
		trevar.insert(89);
		trevar.insert(92);
		trevar.insert(88);
		System.out.println("The inorder values after inserting nodes are:" + "\n");
		trevar.inorder();
		trevar.deleteKey(100);
		System.out.println("\n" + "\n" + "The Sorted values are after deletion are:" + "\n");
		trevar.inorder();

	}

}
