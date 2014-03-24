public class Node2{
    private String data;
    private Node2 next;

    public Node2(String d){
	data=d;
    }
    public void setData(String d){
	data=d;
    }
    public String getData(){
	return data;
    }
    public void setNext(Node2 n){
	next=n;
    }
    public Node2 getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
}