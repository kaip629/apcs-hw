public class MyLinkedList{
    private Node head;
	private Node tail;
    public MyLinkedList(){
	head=null;
	tail=null;
    }
    public void add(String d){
		Node tmp = new Node(d);
		Node tmp2 = head;
		while(tmp2!=null){
			tmp2=tmp2.getNext();
		}
		tmp2.setNext(tmp);
		tail=tmp;
    }
	public void add(int i, String d){
		Node tmp = new Node(d);
		Node tmp2=head;
		if(i==0){
			tmp.setNext(head);
			head=tmp;
		}else{
			try{
				for(int x=0;x<i-1;x++){
					tmp2=tmp2.getNext();
				}
				tmp.setNext(tmp2.getNext());
				tmp2.setNext(tmp);
			}catch(Exception e){
				System.out.println("the location you gave was invalid.");
			}

		}
    }
	public String get(int i){
		Node tmp =head;
		try{
			for(int x=0;x<i;x++){
				tmp = tmp.getNext();
			}
			return tmp.toString();
		}catch(Exception e){
			System.out.println("the location you gave was invalid. Returning null");
			return null;
		}
		
	}
	
	public String get(int i, String d){
		Node tp= new Node(d);
		Node tmp =head;
		try{
			if(i==0){
				tp.setNext(tmp.getNext());
				head=tp;
			}else{
				for(int x=0;x<i-1;x++){
					tmp = tmp.getNext();
				}
				tp.setNext((tmp.getNext()).getNext());
				tmp.setNext(tp);
			}
			return tmp.toString();
		}catch(Exception e){
			System.out.println("the location you gave was invalid. Returning null");
			return null;
		}
		
	}
	public String remove(int i){
		Node tmp=head;
		Node tmp2=head;
		try{
			if(i==0){
				head=tmp.getNext();
			}else{
				for(int x=0;x<i-1;x++){
					tmp = tmp.getNext();
				}
				tmp2=tmp.getNext();
				tmp.setNext((tmp.getNext()).getNext());
			}
			return tmp2.toString();
		}catch(Exception e){
			System.out.println("the location you gave was invalid. Returning null");
			return null;
		}	
	}
	public int length(){
		Node tmp=head;
		int c=0;
		while(tmp!=null){
			tmp=tmp.getNext();
			c++;
		}
		return c;
	}
	public int find(String s){
		Node tmp=head;
		int c=0;
		while(tmp!=null){
			if((tmp.getData()).equals(s)){
				return c;
			}
			tmp=tmp.getNext();
			c++;
		}
		return -1;
	}
	
    public String toString(){
	String s = "";
	Node tmp = head;
	while(tmp!=null){
	    s+=tmp+" ";
	    tmp=tmp.getNext();
	}
	return s;
    }
}