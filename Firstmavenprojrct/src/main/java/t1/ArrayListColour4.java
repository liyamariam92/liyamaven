package t1;

import java.util.ArrayList;

public class ArrayListColour4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("yellow");
		list.add("blue");
		list.add("black");
		if(list.contains("orange")) {
		System.out.println("element found in array");
	}
		else
		{
			System.out.println("element not found in array");
		}
}
}