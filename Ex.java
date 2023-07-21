package CollectionFramework;

import java.util.HashSet;

import java.util.Iterator;

public class Ex {

	public static void main(String[] args) {
		HashSet<String> name=new HashSet<String>();
		name.add("Akash");
		name.add("Chethan");
		name.add("Prudhvi");
		System.out.println(name);
		name.add("Akash");
		//System.out.println(name);
		name.add("Akash");
		name.add(null);
		System.out.println(name);
		System.out.println("Retrive data using iterator");
		Iterator<String> itr=name.iterator();
		
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		
	}

}
