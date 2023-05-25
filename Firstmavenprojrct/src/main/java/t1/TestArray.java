package t1;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4};
try
{
System.out.println(a[5]);
	}
/*catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("out of bond not possible");
}*/
catch(Exception e) {
	System.out.println(e);
}
}
}