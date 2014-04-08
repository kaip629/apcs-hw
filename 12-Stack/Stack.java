import java.io.*;
import java.util.*;
public class Stack{
    String[] stuff;
    int top;
    int capacity=10;
    int size;
    public Stack(){
	stuff = new String[capacity];
	top=0;
    }
    public void push(String s){
	if(size==capacity){
	    capacity=capacity*2;
	    String[] temp = Arrays.copyOf(stuff, capacity);
	    stuff = temp;
	}else{
	    for(int x=0;x<capacity;x++){
		if(stuff[x]==null){
		    stuff[x]=s;
		    break;
		}
	    }
	    
	}
	size++;
    }
    public String pop(){
	if(size==0){
	    return null;
	}else{
	    String ans=stuff[top];
	    stuff[top]=null;
	    size--;
	    if(size==0){
		top=-1;
	    }else{
		for(int x=0;x<capacity;x++){
		    if(stuff[x]!=null){
			top=x;
		    }
		}
	    }
	    return ans;}
    }
    public String toStrings(){
	String ans="";
	for(int x=0;x<capacity;x++){
	    if(stuff[x]==null){
		ans+=", ";
	    }else{
		ans+=stuff[x]+", ";
	    }
	}
	return ans;
    }


}