
import java.util.PriorityQueue;
import java.util.*;
import java.util.Comparator;
public class MedianHeap{

    private PriorityQueue<Integer> x1, x2;

    public MedianHeap(){
	Comparator<Integer> cmp = Collections.reverseOrder(null);  
	x1 = new x2<Integer>(11,cmp);
	x2 = new x2<Integer>();
    }

    public void add(Integer n){
	if(x1.size() >= x2.size()){
	    x2.add(n);
	}else{
	    x1.add(n);
	}
    }

    public Integer findMedian(){
	if(x1.size() > x2.size())
	    return x1.peek();
	else if(x2.size() > x1.size())
	    return x2.peek();
	else
	    return (x1.peek() + x2.peek()) / 2;
    }

    public Integer removeMedian(){
	if(x1.size() > x2.size())
	    return x1.poll();
	else if(x2.size() > x1.size())
	    return x2.poll();
	else
	    return (x1.poll() + x2.poll()) / 2;
    }


}