package com.mf.javaee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String args[]) {

		
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		l.add("6");
		l.add("7");
		l.add("8");
		l.add("9");
		l.add("10");
		l.add("11");
		l.add("12");
		System.out.println(l.size());
		
		
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
		}
		
		ListIterator<String> listIterator = l.listIterator();
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}