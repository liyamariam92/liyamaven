package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("bike");
list.add("car");
list.add("scooter");
list.add("bike");
//list.remove(1);
//list.add(1,"van");
//Collections.sort(list);
/*ArrayList<String> list1 = new ArrayList<String>();
list1.add("lion");
list1.add("tiger");
list1.add("dog");
list.addAll(list1);*/
Iterator itr=list.iterator();
while(itr.hasNext())
		{
System.out.println(itr.next());
	}

}
}