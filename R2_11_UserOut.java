package day11;
//1 ~5만원 사이 금액을 랜덤하게 인출하는 스레드
import java.util.*;
public class R2_11_UserOut extends Thread{
	
	private R2_11_Account account;
	
	public R2_11_UserOut(String name, R2_11_Account ac) {
		this.account=ac;
		setName(name);
	}
	
	public void run() {
		Random ran=new Random();
		for(int i=0;i<5;i++) {
			int val=ran.nextInt(5)+1;
			account.get(val);
		}
	}

}
