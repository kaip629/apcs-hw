public class Node{
    private int data;
    private Node left,right;
	public Node(int a){
		data=a;
	}
	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
	public void setLeft(Node a){
		left=a;
	}
	public void setRight(Node a){
		right=a;
	}
	public int getData(){
		return data;
	}
}
