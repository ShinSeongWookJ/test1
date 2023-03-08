package day11;

public class R2_11_ThreadTest {

	public static void main(String[] args) {
		//1.  Runnable객체를 생성
		R2_11_Snail r=new R2_11_Snail();//코드를 가지고 있다.(run())
		//2. Thread객체 생성
		Thread tr=new Thread(r);
		//3. start()호출
		tr.start();
	}

}
