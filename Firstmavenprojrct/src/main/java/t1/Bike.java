package t1;

public class Bike implements Vehicle,Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj=new Bike();
obj.run();
	}
public void run()
{
	System.out.println("Bike is running");
}
}
