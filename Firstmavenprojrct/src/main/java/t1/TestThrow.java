package t1;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=13;
if(age<18)
{
throw new ArithmeticException("person is not eligible to vote");
	}
else {
	System.out.println("person is eligible to vote");
}
}
}
