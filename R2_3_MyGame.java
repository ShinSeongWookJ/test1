package day03;
import java.util.Scanner;
public class R2_3_MyGame {
	
	public static void startGame() {
		Scanner sc=new Scanner(System.in);
		//컴퓨터가 랜덤한 정수값을 1<= r <=100 사이의 임의의 정수를 발생시킨다.
		//이 값을 맞추는 게임
		//단 게임시도횟수가 7번을 초과하면 "실패!!" 게임 종료 
		
		System.out.println("1~100사이의 정수를 입력하세요");
		int cnt=0;
		int m = (int)(Math.random()*99+1);
		
		while(cnt<=7) {
			if (cnt==7) {System.out.println("회수조과입니다. game over");return;}
			int ans= sc.nextInt();
			if(ans==m) {
				System.out.println("정답입니다! 시도횟수:"+(cnt+1));
				return;
			}
			else if(ans>m) {
				System.out.println(ans+"보다 작은 값입니다.");
				cnt++;
			}
			else if(ans<m) {
				System.out.println(ans+"보다 큰 값입니다.");
				cnt++;
			}
		}
	}

	public static void main(String[] args) {
		
		R2_3_MyGame.startGame();
	}

}
