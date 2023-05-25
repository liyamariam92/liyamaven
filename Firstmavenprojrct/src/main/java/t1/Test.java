package t1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
try {
int result=a/b;
System.out.println(result=+result);
}
catch(ArithmeticException e) {
	System.out.println(e);
	System.out.println("division not possible");
}
finally {
	System.out.println("inside final");
}
	}

}
