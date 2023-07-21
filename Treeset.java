package CollectionFramework;


import java.util.Iterator;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
		name.add("Akash");
		name.add("Chethan");
		name.add("Prudhvi");
		System.out.println(name);
		name.add("Akash");
		//System.out.println(name);
		name.add("Akash");
		//name.add(null);
		System.out.println(name);
		System.out.println("Retrive data using iterator");
		Iterator<String> itr=name.iterator();
		
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		
	}

}
