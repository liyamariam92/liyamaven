package t1;

public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestThrows t=new TestThrows();
try
{
System.out.println(t.divideNum(20,0));
	}
catch(Exception e)
{
	System.out.println("cannot be divided by 0");
}
	}
public int divideNum(int a,int b)throws Exception
{
int div=a/b;
return div;
}
}