package t1;
public class Address11 {
String city,state,country;
int zipcode;
Student student;
public Address11(String city, String state, String country, int zipcode, Student student) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
	this.zipcode = zipcode;
	this.student = student;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(11,"liya");
Address11 obj=new Address11("kowdiar","Kerala","India",691512,s);
	
	obj.display();
	}
public void display()
{
	System.out.println(student.rollno);
	System.out.println(student.name);
	System.out.println(city);
	System.out.println(state);
	System.out.println(country);
	System.out.println(zipcode);
}
}

