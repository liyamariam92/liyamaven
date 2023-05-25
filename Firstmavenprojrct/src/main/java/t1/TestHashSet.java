package t1;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("bike");
		hs.add("car");
		hs.add("scooter");
		hs.remove(1);
		hs.add("car");
		System.out.println(hs);
			}

	}


