package day12;
import java.io.*;
/*bg.jpg를 읽어서 copy.jpg로 내보내자
 * 데이터 소스: bg.jpg(파일) ===>FileInputStream
 * 데이터 목적지: copy.jpg(파일) ===>FileOutputStream
 * 바이트수 출력하기
 * */
public class R2_12_ImageCopy {

	public static void main(String[] args) 
	throws Exception
	{
		String fname="images/bg.png";//읽을 파일
		String target="copy.jpg";//목적 파일
		
		FileInputStream fis= new FileInputStream(fname);
		byte data[]= new byte[1000];
		FileOutputStream fos = new FileOutputStream(target);
		int n=0,total=0,count=0;
		while((n=fis.read(data))!=-1) {
			fos.write(data,0,n);
			fos.flush(); //스트림에 남아있는 데이터가 있으면 밀어내준다
			total+=n;
		}
		System.out.println(target+"에"+total+"byte만큼 썻어요");
		fos.close();


	}

}
