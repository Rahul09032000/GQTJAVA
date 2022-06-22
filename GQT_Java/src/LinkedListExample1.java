import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		LinkedList ll1 = new LinkedList();
		ll1.add(100);
		ll1.add(200);
		ll1.add(300);
		ll1.add(400);
		ll1.add(500);
		System.out.println(ll1);
		
		ll1.add(4, 600);
		System.out.println(ll1);
	}
}
