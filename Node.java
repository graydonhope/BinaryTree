public class Node extends BinaryTree{
	
	int value;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int value, String name){
		this.value = value;
		this.name = name;
	}

	public String toString(){
		return (this.name + "has value of: " + this.value);
	}
}