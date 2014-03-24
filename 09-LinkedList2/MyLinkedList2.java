public class MyLinkedList2{
    private Node2 head;
    public MyLinkedList2(){
	head=new Node2("");
    }
    public void add(String d){
	Node2 tmp = new Node2(d);
	//head=tmp;
	tmp.setNext(head);
	head=tmp;
    }
	public void add(int i, String d){
		Node2 tmp = new Node2(d);
		Node2 tmp2=head;
		if(i==0){
			add(d);
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
		Node2 tmp =head;
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
		Node2 tp= new Node2(d);
		Node2 tmp =head;
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
			return "";
		}
		
	}
	public String remove(int i){
		Node2 tmp=head;
		Node2 tmp2=head;
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
			return "";
		}	
	}
	public int length(){
		Node2 tmp=head;
		int c=0;
		while(!(tmp.getData().equals(""))){
			tmp=tmp.getNext();
			c++;
		}
		return c;
	}
	public int find(String s){
		Node2 tmp=head;
		int c=0;
		while(!(tmp.getData().equals(""))){
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
	Node2 tmp = head;
	while(!(tmp.getData().equals(""))){
	    s+=tmp+" ";
	    tmp=tmp.getNext();
	}
	return s;
    }
}