package t1;

public class TestAbstraction {
	public static void main(String args[]) {
		Bank s;
		s=new Sbi();
		s.rateofInterest();
		s=new Pnb();
		s.rateofInterest();
	}
}
