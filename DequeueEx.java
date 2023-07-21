package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEx {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.offer(7);
		dq.offerFirst(8);//offer method is used to add the elements
		dq.offerLast(9);
		System.out.println(dq);
		
		int r=dq.pollLast();//poll methods is used to delete the elements
		System.out.println(r);
		
		int r1=dq.pollFirst();
		System.out.println(r1);
		
		
		System.out.println(dq);

	}

}
