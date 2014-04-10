public class LLDriver{
    public static void main(String[]args){
	MyLinkedList L=new MyLinkedList();
	L.add("Sully");
	System.out.println(L);
	L.add("mike");
	System.out.println(L);
	L.add("adfadf");
	System.out.println(L);

	Iterator<String> it = L.iterator();
	while (it.hasNext()){
	    System.out.println(it.next());
	}
	System.out.println();
	for(String s : L){
	    System.out.println(s);
	}
    }
}