package t1;
import java.util.Scanner;
public class User extends BankEncapsulation{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter pin");
	int pin=sc.nextInt();
	User obj=new User();
	obj.setPin(pin);
	boolean valid=obj.validate();
	if(valid)
	{
		System.out.println("valid pin");
	}
	else
	{
		System.out.println("invalid pin");	
	}
}
}