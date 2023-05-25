package t1;

public class BankEncapsulation {
private int pin1=1001;
private int pin2=1234;
private int pin3=1212;
	private int pin;
public void setPin(int pin) {
	this.pin=pin;
}
public int getPin()
{
	return pin;

	}
public boolean validate()
{
	if(pin==pin1 || pin==pin2 || pin==pin3)
	{
	return true;
	}
	else
	{
	return false;

}
}
}