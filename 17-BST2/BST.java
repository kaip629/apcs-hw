public class BST {
    private Node root;

    public BST() {
        root = null;
    }
	public void delete(Node a){
		Node current = root;
		Node last = root;
		while(current!=null){
			if(a.getData()>current.getData()){
				last=current;
				current=current.getRight();
			}else{
				last=current;
				current=current.getLeft();
			}
		}
		if(current.getRight()==null || current.getLeft()==null){
			if(current.getRight()==null){
				last.setLeft(current.getLeft());
			}
		}else{
			Node b = deleteHelper1(current.getRight());
			root=current;
			delete(b);
			if(last.getLeft()==current){
				last.setLeft(current.getLeft());
			}else if(last.getRight()==current){
				last.setRight(current.getRight());
			}
			current=b;
		}
	}
	public Node deleteHelper1(Node a){
		while(a!=null){
			a=a.getLeft();
		}
		return a;
	}
	public void insert(Node a){
		if(root==null){
			root=a;
		}
		Node current = root;
		Node last = root;
		while(current!=null){
			if(a.getData()>current.getData()){
				last=current;
				current=current.getRight();
			}else{
				last=current;
				current=current.getLeft();
			}
		}
		if(a.getData()>last.getData()){
			last.setRight(a);
		}else{
			last.setLeft(a);
		}
		
	}
	public Node search(int x){
		Node current = root;
		while(current.getData()!=x && current!=null){
			if(x>current.getData()){
				current=current.getRight();
			}else{
				current=current.getLeft();
			}
		}
		return current.getData();
	}
	public Node search2(Node c, int x){
		if(c==null || c.getData()==x){
			return c
		}else if(x>c.getData()){
			return search2(c.getRight(),x);
		}else{
			return search2(c.getLeft(),x);
		}
	}

}