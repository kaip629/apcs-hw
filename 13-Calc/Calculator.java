import java.io.*;
import java.util.*;
//Im getting that my Integer.parseInt() function and subString() functions are not applicable, but I think that if this cooperated everything would be fine.
public class Calculator{
    public static int compute(String str){
	int prev=0;
	int ans=0;
	String input=str;
	Stack nums = new Stack();
	for(int pos=0;pos<input.length;pos++){
	    if(input.charAt(pos)==' '){
			String snum = input.subString(prev,pos);
			nums.push(snum);
			prev=pos;
	    }else if(input.charAt(pos)=='+'){
			int x=0;
			while(nums.peek()!=null){
				x=Integer.parseInt(nums.pop());
				ans+=x;
			}
	    }else if(input.charAt(pos)=='-'){
			int x=0;
			while(nums.peek()!=null){
				x=Integer.parseInt(nums.pop());
				ans-=x;
			}
		}else if(input.charAt(pos)=='*'){
			int x=0;
			while(nums.peek()!=null){
				x=Integer.parseInt(nums.pop());
				ans=ans*x;
			}
		}else if(input.charAt(pos)=='/'){
			int x=0;
			while(nums.peek()!=null){
				x=Integer.parseInt(nums.pop());
				if(x==0){
					System.out.println("divide by 0");
				}else{
					ans=ans/x;}
			}
		}	
	}
    }
	public static void main(String[]args){
		compute("5 6 2 7 +");
	}
}