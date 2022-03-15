package in.jt;

import java.util.ArrayList;

public class CollectionDemo1 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		System.out.println("al1: "+al1);
		System.out.println(al1.get(4));
		System.out.println("al1: "+al1);
		System.out.println(al1.remove(4));
		System.out.println("al1: "+al1);
		System.out.println(al1.indexOf(10));
		System.out.println(al1.lastIndexOf(10));
		System.out.println(al1.contains("kiran"));
		al1.set(4, "kiran");
		System.out.println("al1: "+al1);
		System.out.println(al1.contains("kiran"));
		System.out.println(al1.isEmpty());
		System.out.println(al1.size());
		al1.clear();
		System.out.println("al1: "+al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.size());
	}
}
