package t1;

public class Employee {
	private int id;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee();
e.setId(10);
e.setName("liya");
System.out.println(e.getId());
System.out.println(e.getName());
	}
public void setId(int id)
{
this.id=id;
}
public void setName(String name) {
	this.name=name;
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
}