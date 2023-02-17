package day11;
//1만원씩 저축하는 스레드
public class R2_11_UserIn extends Thread{
	
	private R2_11_Account account;
	
	public R2_11_UserIn(String name, R2_11_Account ac) {
		this.account=ac;
		setName(name);
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			account.save(1);//1만원씩 저축
		}
	}

}
