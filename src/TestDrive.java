
public class TestDrive {

	public static void main(String[] args) {
		BinaryTree bst=new BinaryTree();
		bst.insertNode(63,"Data Structures and Algorithems");
		bst.insertNode(27, "Computer Architecture");
		bst.insertNode(80, "Object Oriented Programming");
		bst.insertNode(13, "Agile");
		bst.insertNode(51, "Quality Assurance");
		bst.insertNode(70, "C++");
		bst.insertNode(92, "Java");
		bst.insertNode(26, "Networking");
		bst.insertNode(33, "System Analysis and Design");
		bst.insertNode(58, "Management Practice");
		bst.insertNode(82, "ADBMS");
		bst.insertNode(60, "QTC");
		bst.insertNode(57, "DW");
		int k=33;
//		System.out.println("Title of the key= "+k+" is "+(bst.find(k)).value);
		bst.inOrderTraversal(bst.find(63));
		System.out.println();
		bst.delete(63);
		bst.inOrderTraversal(bst.find(70));
		

	}

}
