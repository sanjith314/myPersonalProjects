import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

class Main{
	public static void main(String[] args){
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.pop();
		System.out.println("Stack: "+st);
		Queue<Integer> q=new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.remove();
		System.out.println("Queue: "+q);
		System.out.println("Peek: "+q.peek()+" (Returns head/first element)");
	}
}