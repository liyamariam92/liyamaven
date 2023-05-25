package t1;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map=new HashMap<Integer,String>();
map.put(1, "car");
map.put(2, "bike");
map.put(3, "scooter");
map.put(4, "van");
for(Map.Entry m:map.entrySet())
{
	System.out.println(m.getKey() +""+m.getValue());

}
	}

}
