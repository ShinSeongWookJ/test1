package day12;
import java.io.*;
/*파일을 읽어서 콘솔에 출력해보자
 * 데이터 소스: 파일 => 노드스트림(FileInputStream)
 * 데이터 목적지: 콘솔=> 노드스트림(System.out)
 * 
 * */
public class R2_12_FileInputStreamTest {

	public static void main(String[] args) 
	throws IOException
	{
		String fname="src/day12/R2_12_BufferedReaderWriterTest.java";
		FileInputStream fis=new FileInputStream(fname);
		int n=0, count=0;
		while((n=fis.read())!=-1) {//파일 끝에 도달하면 -1을 반환함
			System.out.write(n);
			count++;
		}
		System.out.println(count+"bytes 읽고 씀");
		fis.close();
		System.out.close();
	}

}
