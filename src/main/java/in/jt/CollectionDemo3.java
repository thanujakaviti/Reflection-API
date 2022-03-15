package in.jt;

import java.util.ArrayList;

public class CollectionDemo3 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(40);
		al1.add(60);
		al1.add(70);
		
		ArrayList al2 = new ArrayList();
		al2.add(20);
		al2.add(40);
		al2.add(30);
		al2.add(50);
		al2.add(70);
		al2.add(80);
		
		System.out.println("al1: "+al1);
		System.out.println("al2: "+al2);
		
		al1.removeAll(al2);
		//al2.removeAll(al1);
		//al1.retainAll(al2);
		//al2.retainAll(al1);
		
		System.out.println("al1: "+al1);
		System.out.println("al2: "+al2);
		
		System.out.println("3: "+al2.get(3));
		System.out.println("4: "+al2.get(4));
		System.out.println("5: "+al2.get(5));
		//al2.add("kiran");
		al2.add(2,"kiran");
		System.out.println("al2: "+al2);
		System.out.println("3: "+al2.get(3));
		System.out.println("4: "+al2.get(4));
		System.out.println("5: "+al2.get(5));
		
		
	}
}