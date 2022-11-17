package day03;
/*java.lang.Math클래스의 주요 메서드
 * 
 *   static final double	PI :원주율 (상수)  "클래스명.변수"
 *   
 *   static int	abs(int a): 절대값을 반환
 *   static double	floor(double a): 내림값을 반환
 *   static double	ceil(double a): 올림값을 반환
 *   
 *   //round() : 반올림
	 * static long	round(double a)
	 * static int	round(float a)
	 * 
 * 	 //random() : 0.0<= r <1.0 사이의 임의의 실수를 발생시켜 반환한다
 * 		static double	random()
 * */
public class R2_3_MathTest {

	public static void main(String[] args) {
		System.out.println(Math.PI);//3.141592653589793
		int x=Math.abs(-100);
		System.out.printf("-100의 절대값: %d%n", x);
		
		//12.001 실수값의 내림값과 올림값을 구해 출력하세요
		double y=Math.floor(12.001);
		System.out.printf("12.001의 내림값:%.3f%n", y);
		
		y=Math.ceil(12.001);
		System.out.printf("12.001의 올림값:%.3f%n", y);
		
		//12.456의 반올림값을 구해 출력하세요
		int z=Math.round(12.56f);
		System.out.printf("12.56의 반올림값:%d%n", z);
		
		//random()메서드 이용해서 임의의 실수를 3번 발생시켜 출력하세요
		for(int i=0;i<3;i++) {
			double r=Math.random();
			System.out.println(r);
		}
		System.out.println("---------------------");
		//random() : 0.0<= r <1.0 사이의 임의의 실수를 발생시켜 반환한다
		/*
		[문제1] 0<= v2 <10 사이의 임의의 정수를 발생시키세요.		
		[문제2] 5<= v3 <15 사이의 임의의 정수를 발생시키세요.				
		*/
		int v2=(int)(Math.random()*10);
		System.out.println(v2);
		
		int v3=(int)(Math.random()*10+5);
		System.out.println(v3);
		
		//(int)(Math.random()*범위 + 시작수)
		
		// 23<= v4 < 55 사이의 임의의 정수를 발생시켜 출력하기
		int v4=(int)(Math.random()*32+23);
		
		System.out.printf("23<= v2 <55 사이의 임의의 정수 : %d \n",v4);

		//랜덤하게 알파벳 대문자를 발생시켜 출력하세요
		char a = (char)((Math.random()*26)+'A');		
		System.out.println("랜덤 대문자 : "+a);

		//아래와 같은 형태로 랜덤한 알파멧을 출력하세요
		/*		E W Q R P
				U I Z W X
				M O G H A

				중첩 반복문 활용
		 * 
		 * */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				char ran = (char) (Math.random() * 26 + 65);
				System.out.print(ran + " ");
			}
			System.out.println();
		}

		
	}

}
