import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    public Iterator<E> iterator(){
	return new MyLLIterator<E>(head);
    }
    public MyLinkedList(){
	head=null;
    }
    public void add(E d){
	Node tmp = new Node(d);
	//head=tmp;
	tmp.setNext(head);
	head=tmp;
    }
    public String toString(){
	String s = "";
	Node tmp=head;
	while(!(tmp.equals(null))){
	    s+=tmp;
	    tmp=tmp.getNext();
	}
	return s;
    }
}