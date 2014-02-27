
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

	public boolean delete(int key){
		Node current=root;
		Node parent=root;
		boolean leftchild=true;
		
		while(current.key!=key){
			parent=current;
			if(current.key>key){
				leftchild=true;
				current=current.left;
			}else{
				leftchild=false;
				current=current.right;				
			}
			if(current==null){
				return false;
			}
		}
		//either root or leaf node.
		if(current.left==null && current.right==null){
			if(current==root)
				root=null;
			else if(leftchild)
				parent.left=null;
			else
				parent.right=null;		
		}else if(current.right==null){			//Node to be deleted has only one child
			if(current==root)
				root=current.left;
			else if(leftchild)
				parent.left=current.left;
			else
				parent.right=current.left;
		}else if(current.left==null){
			if(current==root)
				root=current.right;
			else if(leftchild)
				parent.left=current.right;
			else
				parent.right=current.right;
		}else{
			Node succ=getSuccessor(current);
			if(current==root)
				root=succ;
			else if(leftchild)
				parent.left=succ;
			else
				parent.right=succ;
			succ.left=current.left;
		}
		return true;
	}
	
	public Node getSuccessor(Node delNode){		
		Node successorPare=delNode;
		Node successor=delNode;
		Node curr=delNode.right;
		while(curr!=null){
			successorPare=successor;
			successor=curr;
			curr=curr.left;
		}
		if(successor!=delNode.right){
			successorPare.left=successor.right;
			successor.right=delNode.right;
		}
		return successor;
	}
}
