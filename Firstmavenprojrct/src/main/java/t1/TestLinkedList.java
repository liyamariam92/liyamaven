package t1;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("bike");
		list.add("car");
		list.add("scooter");
		list.add("bike");
	list.remove(1);
	list.add("van");
		for(String lis:list)
		{
			System.out.println(lis);
		}
	}

}
