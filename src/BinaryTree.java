
public class BinaryTree {
	Node root;
	
	public void insertNode(int val,String name){
		Node newNode=new Node(val,name);
		if(root==null){
			root=newNode;
		}else{
			Node current=root;
			Node parent;
			while(true){
				parent=current;
				if(current.key>val){
					current=current.left;
					if(current==null){
						parent.left=newNode;
						break;
					}
				}else{
					current=current.right;
					if(current==null){
						parent.right=newNode;
						break;
					}
				}
			}
		}
	}

	public Node find(int k){
		Node current=root;
		while(current.key!=k){
			if(current.key>k){
				current=current.left;
			}else{
				current=current.right;
			}
			if(current==null){
				return null;
			}
		}
		return current;
	}

	public void inOrderTraversal(Node node){
		if(node!=null){
			inOrderTraversal(node.left);
			System.out.println(node.key);
			inOrderTraversal(node.right);
		}
	}

	public void delete(int key){
		
	}
}
