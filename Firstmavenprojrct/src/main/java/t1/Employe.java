package t1;

public class Employe {
int id;
String name;
Address address;
	
public Employe(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address obj=new Address("trivandrum","kerala","india",695003);
Employe e=new Employe(12,"liya",obj);
e.display();
	}
public void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(address.city);
	System.out.println(address.state);
	System.out.println(address.country);
	System.out.println(address.zipcode);
}
}
