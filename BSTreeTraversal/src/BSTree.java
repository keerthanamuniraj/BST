
/*-----------------------Author : Keerthana ------------------------ */
//Binary Search Tree Traversal along with Tree display

public class BSTree {

	public static void main(String[] args){
		BSTree bst = new BSTree();
		
		bst.createtree();
		System.out.println("BS Tree display");
		bst.displaytree(bst.root,0);
		
		System.out.println("inorder traversal");
		bst.InOrder(bst.root);
		System.out.println("\nPreorder traversal");
		bst.PreOrder(bst.root);
		System.out.println("\nPostOrder traversal");
		bst.PostOrder(bst.root);
	}
	
	
	class BSTNode{
		
		String info;
		BSTNode left;
		BSTNode right;
		
		public BSTNode (String value){
			info = value;
		}
		
		
	}
	
	// start the tree creation with the root node
	BSTNode root;
	
	public void createtree(){
		
		root = new BSTNode ("11");
		root.left = new BSTNode ("7");
		root.left.left = new BSTNode ("5");
		root.left.left.left = new BSTNode ("3");
		root.left.left.right = new BSTNode ("6");
		root.left.right = new BSTNode ("9");
		
		root.right = new BSTNode ("15");
		root.right.left = new BSTNode ("13");
		root.right.right =new BSTNode("17");
	}
	
	public void displaytree(BSTNode node, int spaces){
		if(node!=null){
			displaytree(node.right,++spaces);
			for (int i = 0; i< spaces; i++){
				System.out.print(" "); }
			System.out.println(node.info + "\n\n");
		
			displaytree(node.left, spaces); 
			
		}
	}
	
	public void InOrder(BSTNode node){
		if(node!=null){
			
			
			InOrder(node.left);
			System.out.print(node.info + " ");
			InOrder(node.right);
		}	
	}
	
	public void PreOrder(BSTNode node){
		if(node!=null){
			
			System.out.print(node.info + " ");
			PreOrder(node.left);
			PreOrder(node.right);
		}	
	}

	public void PostOrder(BSTNode node){
		if(node!=null){
			PostOrder(node.left);
			PostOrder(node.right);
			System.out.print(node.info + " ");
			
		}	
	}
}

