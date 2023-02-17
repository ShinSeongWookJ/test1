package day11;

public class R2_11_AccountTest {

	public static void main(String[] args) {

		R2_11_Account ac=new R2_11_Account();
		
		R2_11_UserIn u1=new R2_11_UserIn("개미", ac);
		R2_11_UserOut u2=new R2_11_UserOut("베짱이", ac);
		
		u2.start();
		u1.start();

	}

}
