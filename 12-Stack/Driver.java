public class Driver{
	public static void main(String[]args){
		Stack a = new Stack();
		a.push("s1");
		a.push("s2");
		System.out.println(a.toStrings());
		System.out.println(a.pop());
		System.out.println(a.toStrings());
	}
}