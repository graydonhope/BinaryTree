public class BinaryTree{
	
	Node root;


	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.addNode(0,"first");

	}
    
	public void addNode(int value, String name){
		Node newNode = new Node(value, name);
		if(root == null){
			root = newNode;
		}
		else{
			Node currentNode = root;
			Node parent;

			while(true){
				parent = currentNode;
				if(value < currentNode.value){
					currentNode = currentNode.leftChild;
					if(currentNode == null){
						parent.leftChild = newNode;
						return;
					}
					else{
						currentNode = currentNode.rightChild;
						if(currentNode == null){
							parent.rightChild = newNode;
							return;
						}
					}
				}
			}
		}
	}
}