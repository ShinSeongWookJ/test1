package day12;
import java.io.*;
import javax.swing.*;
import java.util.*;
//obj.txt파일을 읽어서 객체들을 복원해보자
public class R2_12_ObjectInOut2 {

	public static void main(String[] args) 
	throws Exception
	{
		String fname="src/day12/obj2.txt";
		//파일=>FileInputStream=>ObjectInputStream
		ObjectInputStream ois
		=new ObjectInputStream(new FileInputStream(fname));

		Object obj1=ois.readObject();//JFrame
		Object obj2=ois.readObject();//Date
		//쓴 순서대로 읽어들여야 한다
		JFrame f=(JFrame)obj1;
		f.setSize(200,200);
		f.setVisible(true);
		
		Date d=(Date)obj2;
		System.out.println(d);
		//m1,m2,m3를 읽어서 복원시킨뒤 showInfo()호출해서 반환값 출력하기
		R2_12_Member m1=(R2_12_Member)ois.readObject();
		R2_12_Member m2=(R2_12_Member)ois.readObject();
		R2_12_Member m3=(R2_12_Member)ois.readObject();
		
		System.out.println(m1.showInfo());
		System.out.println(m2.showInfo());
		System.out.println(m3.showInfo());
		
		
		ois.close();
	}

}
