package day04;

public class R2_4_ArrayTest3 {

	public static void main(String[] args) {
		// [문제1] String 유형을 저장하는 이차원 배열을 선언하고 생성, 초기화하세요
		//  반복문 이용해서 출력하되 모두 소문자로 바꿔 출력하세요
		 String[][] arrstr= {{"Hello","Hi"},{"Java","CSS"},{"hello","World", new String("BYE~~")}};
		 
		 String [][]p;
			p=new String[2][3];
			p[0][0]="Java";
			p[0][1]="Java Script";
			p[0][2]="HTML";
			
			p[1][0]="CSS";
			p[1][1]="Python";
			p[1][2]="Ajax";
			
			
			for(int i=0; i<p.length; i++) {
				for(int j=0; j<p[i].length; j++) {
					System.out.print(p[i][j].toLowerCase()+" ");
				}System.out.println();
			}
			for(String[] str:arrstr) {
				for(String s:str)
					System.out.println(s.toUpperCase());
			}
			
		
		/* 문제 2] 2차원 배열에 다음의 값을 저장하되,
		  for루프를 이용해 저장하자.
		  그런 뒤, 저장된 값들을 출력해봅시다.
		  1 0 0 0 0
		  0 1 0 0 0
		  0 0 1 0 0
		  0 0 0 1 0
		  0 0 0 0 1
		 */
			int a[][]=new int[5][5];
			for(int x=0;x<a.length;x++) {
				for(int y=0;y<a[x].length;y++) {
					if(x==y) {
						a[x][y]=1;
					} 
					System.out.print(a[x][y]+" ");
				}
				System.out.println();
			}
		
			/*  1 2 3 4 5
			 * 
			 * */
			System.out.println("-----------------------");
			
			int[] arr [] =new int[5][5];
			int cnt=0;
			int x=0, y=0;//배열의 행의 인덱스와 열의 인덱스로 사용할 변수
			for(int j=0;j<2;j++) {
				for(int i=0;i<4-2*j;i++) {
					arr[y+j][x+j]=++cnt;
					x++;
				}
				if(x+y+2*j==4) {
					for(int i=0;i<4-2*j;i++) {
						arr[y+j][x+j]=++cnt;
						y++;
					}
				}
				if(x==y) {
					for(int i=0;i<4-2*j;i++) {
						arr[y+j][x+j]=++cnt;
						x--;
					}
				}
				if(x+y+2*j==4) {
					for(int i=0;i<4-2*j;i++) {
						arr[y+j][x+j]=++cnt;
						y--;
					}				
				}
			}//for j----------------------------
			arr[2][2]=++cnt;
			
			System.out.println("-----------------------");
			for(int i=0;i<arr.length;i++) {
				for(int k=0;k<arr[i].length;k++) {
					System.out.print(arr[i][k]+"\t");
				}
				System.out.println();
			}
			/* 아래 선언된 변수들의 자료형을 맞춰봅시다.
			 * 
			 * (1)   int i, j[]          : i (정수형)  , j (정수형의 1차원배열)
			 * (2)   int[] i, j[], k;    : i(1차원배열),  j(2차원배열), k(1차원배열)
			 * (3)   int i, []j[], k[];    : i (정수형) ,  j(2차원배열) , k(1차원배열)
			 * (4)   int [][]i, j[];    : i(2차원)   ,  j(3차원)
			 * 
			 * */
			
			
			
	}

}




