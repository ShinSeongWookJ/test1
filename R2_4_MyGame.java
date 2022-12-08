package day04;
import java.util.*;

public class R2_4_MyGame {
	
	public void menu() {
		System.out.println("*******MyGame v1.1**********");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("****************************");
		System.out.println("입력하세요 => ");
		System.out.println("****************************");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		R2_4_MyGame my=new R2_4_MyGame();
		for(;;) {
			my.menu();
			int num=sc.nextInt();
			if(num==9) {//종료
				System.out.println("Bye Bye~~");
				//break;
				System.exit(0);//시스템 종료
			}
			if(num<1 || num>3) {
				System.out.println("입력 오류!! 메뉴에 없는 번호에요");
				//break;
				continue;
			}
			//System.out.println(">>가위 바위 보 진행중<<<");
			
			int com=(int)(Math.random()*3+1);
			
			my.gameResult(num, com);
			
		}//for----
	}//main()-----------------
	public void gameResult(int num, int com) {
		String[] label= {"가위(✌)","바위(●)","보(▤)"};
		System.out.println("당신: "+num+" "+label[num-1]);
		System.out.println("컴퓨터: "+com+" "+label[com-1]);
		if(num==com) {
			System.out.println("비겼네요!!");
		}else if((num==1&&com==3)||(num==2&&com==1)||(num==3&&com==2)) {
			//내가 이긴 경우 (num:1, com:3), (num:2, com:1), (num:3, com:2)
			System.out.println("당신이 이겼어요~*^^*");
		}else {//내가 진 경우
			System.out.println("당신이 졌어요ㅜㅜ");
		}
	}

}//class --------------------------------------








