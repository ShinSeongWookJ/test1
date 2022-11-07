package day02;

public class R2_Operator2 {

	public static void main(String[] args) {
		System.out.println("2항 연산자---------");
		System.out.println("5. 산술연산자(+,-,*,/,%)");
		int x=3;	// 0011
		int y=5;    // 0101
		
		System.out.println(y/x);//1
		System.out.println(y%x);//2
		System.out.println("6. 비트 연산자 (&, |, ^)");
		//정수값에만 사용되는 연산자: 정수를 비트로 바꾸어 연산한다
		System.out.printf("%d & %d = %d%n",x,y,(x&y));//1
		System.out.printf("%d | %d = %d%n",x,y,(x|y));
		System.out.printf("%d ^ %d = %d%n",x,y,(x^y));
		
		//-10을 비트로 바꾸세요
		//양수 10:  00000000 00000000 00000000 00001010
		//1의 보수:  11111111 11111111 11111111 11110101  
		//    +1 : 11111111 11111111 11111111 11110110 ==> -10
		//팁) 양수값 10을 비트로 변환한 뒤
		//    하위에서 첫번째 1을 만날때까지는 양수의 비트와 동일하게 작성
		//    첫번1을 만난 뒤부터는 비트 반전한다
		
		//-10     : 11111111 11111111 11111111 11110110
		//-10>>3  : 111 11111111 11111111 11111111 11110
		//-10<<3  : 11111 11111111 11111111 11110110 000
		//-10>>>3 : 000 11111111 11111111 11111111 11110
		System.out.println(-10>>3);//-2
		System.out.println(-10<<3);//-80
		System.out.println(-10>>>3);
		/*Shift연산자
		1) << : 왼쪽으로 비트수만큼 이동.
				오른쪽에 남은 빈칸은 0으로 채움
		2) >> : 오른쪽으로 비트수만큼 이동.
				앞에 남은 빈칸은 부호비트로 채움
		3) >>>: 오른쪽으로 비트수만큼 이동.
				앞에 남은 빈칸은 무조건 0으로 채움		
		*/
		System.out.println("논리연산자( &,&&, |,||)-----");
		/* 1) &
		   2) |
		   : 앞의 연산으로 결과를 알 수 있어도 뒤의
		     문장까지 비교한다.
			
        3) &&
		   4) ||
		   : &&의 경우 앞의 연산 결과가 false라면
		     뒤의 연산을 생략한다.
			 ||의 경우는 앞의 연산결과가 true라면
			 뒤의 연산을 생략한다.
		
			 [문제1] 다음 출력 결과를 예측하세요
		*/
		int m=50, n=60;
		
		if((m>n) & (m>0)) {
			System.out.println("###");
		}else if((n>m)| (n<0)) {
			System.out.println("@@@");
		}
		
		if((m>n) && (m>0)) {
			System.out.println("###");
		}else if((n>m)|| (n<0)) {
			System.out.println("@@@");
		}
		//[1]
		int i=1;
		int j=i++; //j: 1   , i:2
		if((i>++j) && (i++ == j)) {
			i=i+j;
		}
		System.out.println("i="+i);
		//[2]
		int k=0;
		int p=1;
		if((k++ ==0)||(p++ ==2)) {//k=1, p=2
			k=42;
		}
		System.out.println("k="+k+", p="+p);//k=42, p=1
		
	}//main() end-------------
}//class end---------------------------
