package CollectionFramework;

import java.util.HashMap;

public class Hashmapex {

	public static void main(String[] args) {
		HashMap<Integer, String> hm =new HashMap<>();
		hm.put(1, "abc");
		hm.put(2, "abc");
		//hm.put(2, "pqr");
		hm.putIfAbsent(2, "pqr");
		System.out.println("Hash map:" +hm);

	}

}
