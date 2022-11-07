package day02;
import javax.swing.JOptionPane;
public class R2_SwitchTest {

	public static void main(String[] args) {
		// 월을 입력하세요 (1 ~ 12) 
		// 일수를 알려주는 프로그램
		//1,3,5,7,8,10,12 : 31일
		//2  : 28일 or 29일
		//4,6,9,11  : 30일
		/*
		 * switch(변수|수식){
		 *   case 값1: 실행문; break;
		 *   case 값2: 실행문; break;
		 *   ...
		 *   default: 실행문;
		 * }
		 * 이 때 변수 또는 수식은 int형 이하의 자료형 이거나 String유형만 가능하다.
		 * */
		/*String a="2";
		switch(a) {
		case "1": System.out.println("One");break;
		case "2": System.out.println("Two"); break;
		}*/
		String month=JOptionPane.showInputDialog("월을 입력하세요");
		int num= Integer.parseInt(month);
		int day=0;
		switch(num) {
		case 1: 
		case 3:
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12:day=31;break;
		case 2: day=28;break;
		case 4: case 6: case 9: case 11: day=30; break;
		default:
			System.out.println("1~12월까지만 입력해야 해요");
			return;
		}
		System.out.printf("%d월은 %d일까지 있습니다.\n",num,day);

		byte b=10;
		char ch=(char)b;
		System.out.println(ch);
	}

}
