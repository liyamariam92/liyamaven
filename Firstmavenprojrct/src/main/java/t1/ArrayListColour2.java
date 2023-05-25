package t1;

import java.util.ArrayList;

public class ArrayListColour2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("yellow");
		list.add("blue");
		list.add("black");
		for(int i=0;i<list.size();i++)
		{
System.out.println(list.get(i));
		}
	}

}
