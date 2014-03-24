public class LLDriver2{
    public static void main(String[]args){
	MyLinkedList2 L=new MyLinkedList2();
	L.add("Sully");
	System.out.println(L);
	L.add("mike");
	System.out.println(L);
	L.add("adfadf");
	System.out.println(L);
	L.add(2,"jysd");
	System.out.println(L);
	System.out.println(L.get(3));
	System.out.println(L.get(0,"Kai"));
	System.out.println(L);
	System.out.println(L.remove(2));
	System.out.println(L);
	System.out.println(L.find("mike"));
	System.out.println(L.length());
	}
}