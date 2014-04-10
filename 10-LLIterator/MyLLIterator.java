import java.io.*;
import java.util.*;

public class MyLLIterator<E> implements Iterator<E>{
    private Node<E> currentNode;
    public MyLLIterator<E>(Node<E> n){
	currentNode = new Node(n);
    }
    public boolean hasNext(){
	if((currentNode.getNext()).equals(null)){
	    return false;
	}else{
	    return true; 
	}
    }
    public E next(){
	E data = (currentNode.getNext()).getData();
	currentNode = currentNode.getNext();
	return E;
    }
}