import java.io.*;
import java.util.*;
public class Sorts{
    
    private static int partition(int[] a,int L, int R){
	//partition array and return index of pivot
	System.out.println(toString(a));
	Random rand=new Random();
	int pivot=a[rand.nextInt(R-L)+L];
	a[(R-L)/2]=a[R];
	a[R]=pivot;
	int wall=L;
	System.out.println(toString(a));
	for(int i=L;i<R;i++){
	    if(a[i]<pivot){
		int temp;
		temp=a[wall];
		a[wall]=a[i];
		a[i]=temp;
		wall++;
	    }
	}
	if(R!=wall){
		a[R]=a[wall+1];
		a[wall+1]=pivot;
		}
	System.out.println(toString(a));
	return a[wall+1];
    }
    public static int[] qSort(int[] a,int L, int R){
		if(R<=L){
			return a;
		}else{
			partition(a,L,R);
			return qSort(a,L+1,R-1);
		}
    }
    
    public static String toString(int[] a){
	String ans="";
	for(int x=0;x<a.length;x++){
	    ans+=a[x];
	}
	return ans;
    }
    
    public static void main(String[]args){
	int[] hi = new int[10];
	hi[0]=1;
	hi[1]=2;
	hi[2]=4;
	hi[3]=6;
	hi[4]=2;
	hi[5]=3;
	hi[6]=7;
	hi[7]=3;
	hi[8]=2;
	hi[9]=4;
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));
	System.out.println(partition(hi,0,9));	
    }
}