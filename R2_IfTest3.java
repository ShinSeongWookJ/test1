package day02;
//java 11버전 이후: java.base모듈만 사용 가능함 (java.lang, java.util, java.io, java.net)
import javax.swing.JOptionPane;//=> java.desktop모듈이 필요함
public class R2_IfTest3 {

	public static void main(String[] args) {
		//Ctrl+D : 현재 커서 라인을 삭제함
		String kor=JOptionPane.showInputDialog("국어 점수를 입력하세요");
		String eng=JOptionPane.showInputDialog("영어 점수를 입력하세요");
		if(kor==null||eng==null) {
			System.out.println("값을 입력해야 해요");
			return;
		}
		
		System.out.println(kor+"/"+eng);
		//합계점수를 출력하세요
		System.out.println(kor+eng);
		
		//java.lang.Integer클래스의 메서드
		//public static int parseInt(String s):문자열s를 정수로 변환해서 반환해준다.
		//static메서드(클래스 메서드): "클래스명.메서드명()" 접급해야 함
		int total=Integer.parseInt(kor)+Integer.parseInt(eng);
		System.out.println("합계 점수: "+total);
		//165/2=82.5
		
		double avg = total / 2.0;
		System.out.println("평균 점수 : " + avg);
		char hakjum=' ';
		if (90 <= avg && avg <= 100) {
			//System.out.println("A학점");
			hakjum='A';
		} else if (80 <= avg && avg < 90) {
			//System.out.println("B학점");
			hakjum='B';
		} else if (70 <= avg && avg < 80) {
			//System.out.println("C학점");
			hakjum='C';
		} else if (60 <= avg && avg < 70) {
//			System.out.println("D학점");
			hakjum='D';
		} else {
//			System.out.println("F학점");
			hakjum='F';
		}
		System.out.println("국어\t영어");
		System.out.println("---------------------");
		System.out.println(kor+"\t"+eng);
		System.out.println("---------------------");
		System.out.println("총합계: "+total+"점");
		System.out.println("평 균 : "+avg+"점");
		System.out.println("학 점 : "+hakjum);
		
		
		//평균점수 구해서
		//if문 이용해서 학점을 출력하세요
		//90점대:A
		//80 :B
		//70 : C
		//60 : D
		//그외: F
	}

}



