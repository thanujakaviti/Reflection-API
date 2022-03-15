package in.jt;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		//container object
		ArrayList al = new ArrayList();
		//contained object
		Integer i1 = new Integer(10);
		Boolean b1 = new Boolean(true);
		Character c1 = new Character('M');
		String s1 = new String("Kiran");
		
		al.add(i1);
		al.add(b1);
		al.add(c1);
		al.add(s1);
		al.add(i1);
		al.add(b1);
		al.add(c1);
		al.add(s1);
		al.add(null);
		al.add(null);
		al.add(100L);
		al.add(12.23F);
		al.add(34.34D);
		System.out.println(al);
		System.out.println(al.size());
		
	}
}
