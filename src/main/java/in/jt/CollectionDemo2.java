package in.jt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionDemo2 {
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
		
		System.out.println(al1.containsAll(al2));
		al1.add(30);
		System.out.println(al1.containsAll(al2));
		System.out.println("al1: "+al1);
		//al1: 10, 20, 40, 60, 70, 30]
		Enumeration en = Collections.enumeration(al1);
		//en: 10, 20, 40, 60, 70, 30
		while(en.hasMoreElements()) {
			//System.out.println(en.nextElement());
			Integer value = (Integer) en.nextElement();
			if(value % 15 == 0) {
				System.out.println(value);
			}
		}
		System.out.println("----------------");
		System.out.println(Collections.max(al1));
		System.out.println(Collections.min(al1));
		System.out.println("----------------");
		Collections.sort(al1);
		System.out.println("al1: "+al1);
		
		Iterator itr = al1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			itr.remove();
		}
		System.out.println("\nal1: "+al1);
		System.out.println("************************");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(60);
		al.add(70);

		System.out.println("al: "+al);
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			//li.remove();
			//li.add(111);
			li.set(new Scanner(System.in).nextInt());
		}
		System.out.println("----------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("************************");
	}
}
