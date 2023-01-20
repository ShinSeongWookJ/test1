package day09;

public class R2_9_Local {
	String str="$$$";//멤버변수
	
	void sub() {
		class LocalInner{
			
		}
	}
	
	void demo() {
		final String lstr="###";//로컬변수=> 로컬이너클래스에서 사용하려면 final변수여야 한다. 값을 수정할 수 없ㄷ.
		System.out.println("str: "+str);
		System.out.println("lstr: "+lstr);
		
		class LocalInner{
			int no=100;
			void print() {
				System.out.println("--LocalInner's print()--------");
				System.out.println("no="+no);
				System.out.println("str="+str);
				System.out.println("lstr="+lstr);
				//lstr="값을 변경해볼까?";
				str="test";
			}			
		}////////////////
		LocalInner li=new LocalInner();
		li.print();
		
	}//demo()---------------------

	public static void main(String[] args) {
		//demo()호출하기
		R2_9_Local lc=new R2_9_Local();
		lc.demo();
		
		//Local.LocalInner li=new Local().new LocalInner(); [x]
	}

}
